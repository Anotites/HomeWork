package additional.strings;

import static additional.strings.Strings.toHoursMinuteSecondMillisecond;
import static additional.strings.Strings.toWeek;

public class Main {
    public static void main(String[] args) {
        long millisecond = 7403852;

        int days = 70;
//        int number1 = 1;
//        int number2 = 10;
//        int number3 = 12;
//        int number4 = 21;
//        int number5 = 30;
//        int number6 = 100;
//        int number7 = 101;
//        int number8 = 110;
//        int number9 = 112;
//        int number10 = 121;
//        int number11 = 130;
//        int number12 = 1000;
//        int number13 = 1001;
//        int number14 = 1010;
//        int number15 = 1012;
//        int number16 = 1021;
//        int number17 = 1030;
//        int number18 = 1100;
//        int number19 = 1101;
//        int number20 = 1110;
//        int number21 = 1112;
//        int number22 = 8000;
//        int number23 = 18110;
//        int number24 = 18111;
//        int number25 = 18010;
//        int number26 = 18011;
//        int number27 = 18021;
//        int number28 = 18020;
//        int number29 = 110110;
//        int number30 = 111111;
//        int number31 = 120220;
//        int number32 = 121221;
//        int number33 = 110110110;
//        int number34 = 111111111;
//        int number35 = 120120220;
        int number36 = 121121221;
//        int number37 = 1000000;
//        int number38 = 100000000;
//        int number39 = -100000001;
        double doubleNumber = 223.1599999;

        System.out.println(Strings.toString1(number36));
        System.out.println(Strings.toString2(doubleNumber));
        System.out.println(toWeek(days));
        System.out.println(toHoursMinuteSecondMillisecond(millisecond, true));
    }
}
