package home_work_3.calcs.additional;

import java.util.ArrayList;
import java.util.List;

public class CalculatorStringExpression {

    public static void main(String[] args) {
        String text = "4.1 + 15 * 7 + (28 / 5) ^ 2";
        List<Operator> operators = analysisOfOperators(text);
        OperatorBuffer operatorBuffer = new OperatorBuffer(operators);
        System.out.printf("%.2f%n", expr(operatorBuffer));
    }

    public enum OperatorType {
        PLUS, MINUS, MUL, DIV, POW, ABS, PI, E, LEFT_BRACKET, RIGHT_BRACKET, NUMBER, END
    }

    public static class Operator {
        OperatorType type;
        String value;

        public Operator(OperatorType type, String value) {
            this.type = type;
            this.value = value;
        }

        public Operator(OperatorType type, Character value) {
            this.type = type;
            this.value = value.toString();
        }

        @Override
        public String toString() {
            return "Operator{" +
                    "type=" + type +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    public static class OperatorBuffer {
        private int position;

        public List<Operator> operators;

        public OperatorBuffer(List<Operator> operators) {
            this.operators = operators;
        }

        public Operator next() {
            return operators.get(position++);
        }

        public void back() {
            position--;
        }
    }

    public static List<Operator> analysisOfOperators(String expText) {
        ArrayList<Operator> operators = new ArrayList<>();
        int position = 0;
        while (position < expText.length()) {
            char c = expText.charAt(position);
            switch (c) {
                case '(':
                    operators.add(new Operator(OperatorType.LEFT_BRACKET, c));
                    position++;
                    continue;
                case ')':
                    operators.add(new Operator(OperatorType.RIGHT_BRACKET, c));
                    position++;
                    continue;
                case '+':
                    operators.add(new Operator(OperatorType.PLUS, c));
                    position++;
                    continue;
                case '-':
                    operators.add(new Operator(OperatorType.MINUS, c));
                    position++;
                    continue;
                case '*':
                    operators.add(new Operator(OperatorType.MUL, c));
                    position++;
                    continue;
                case '/':
                    operators.add(new Operator(OperatorType.DIV, c));
                    position++;
                    continue;
                case '^':
                    operators.add(new Operator(OperatorType.POW, c));
                    position++;
                    continue;
                case 'P':
                    operators.add(new Operator(OperatorType.PI, c));
                    position++;
                    position++;
                    continue;
                case 'E':
                    operators.add(new Operator(OperatorType.E, c));
                    position++;
                    continue;
                default:
                    if (c <= '9' && c >= '0' || c == '.') {
                        StringBuilder sb = new StringBuilder();
                        do {
                            sb.append(c);
                            position++;
                            if (position >= expText.length()) {
                                break;
                            }
                            c = expText.charAt(position);
                        } while (c <= '9' && c >= '0' || c == '.');
                        operators.add(new Operator(OperatorType.NUMBER, sb.toString()));
                    } else if (c <= '9' && c >= '0' || c == '|' || c == '.' || c == '-') {
                        StringBuilder sb = new StringBuilder();
                        do {
                            sb.append(c);
                            position++;
                            if (position >= expText.length()) {
                                break;
                            }
                            c = expText.charAt(position);
                        } while (c <= '9' && c >= '0' || c == '|' || c == '.' || c == '-');
                        operators.add(new Operator(OperatorType.ABS, sb.toString()));
                    } else {
                        if (c != ' ') {
                            System.out.println("Ошибка! Недопустимый знак. Далее выражение просчитывается без учета этого знака");
                        }
                        position++;
                    }
            }
        }
        operators.add(new Operator(OperatorType.END, ""));
        return operators;
    }

    public static double expr(OperatorBuffer operators) {
        Operator operator = operators.next();
        if (operator.type == OperatorType.END) {
            return 0;
        } else {
            operators.back();
            return plusMinus(operators);
        }
    }

    public static double plusMinus(OperatorBuffer operators) {
        double value = multDiv(operators);
        while (true) {
            Operator operator = operators.next();
            switch (operator.type) {
                case PLUS:
                    value += multDiv(operators);
                    break;
                case MINUS:
                    value -= multDiv(operators);
                    break;
                case END:
                case RIGHT_BRACKET:
                    operators.back();
                    return value;
            }
        }
    }

    public static double multDiv(OperatorBuffer operators) {
        double value = factor(operators);
        while (true) {
            Operator operator = operators.next();
            switch (operator.type) {
                case MUL:
                    value *= factor(operators);
                    break;
                case DIV:
                    value /= factor(operators);
                    break;
                case POW:
                    value = Math.pow(value, factor(operators));
                    break;
                case END:
                case RIGHT_BRACKET:
                case PLUS:
                case MINUS:
                    operators.back();
                    return value;
            }
        }
    }

    public static double factor(OperatorBuffer operators) {
        Operator operator = operators.next();

        switch (operator.type) {
            case NUMBER:
                return Double.parseDouble(operator.value);
            case PI:
                return Math.PI;
            case E:
                return Math.E;
            case ABS:
                String newForABS = operator.value;
                String newForABS1 = newForABS.replaceAll("[^A-Za-zА-Яа-я0-9\\.]", "");
                double finalValue = Double.parseDouble(newForABS1);
                return Math.abs(finalValue);
            case LEFT_BRACKET:
                double value = plusMinus(operators);
                operator = operators.next();
                return value;
            default:
                System.out.println("Ошибка! Выражение не валидное. Полученный результат необходимо игнорировать.");
                return 0;
        }
    }
}
