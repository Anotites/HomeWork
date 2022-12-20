package additional.collections;

import static additional.collections.Generator.*;

public class Person extends Alive {

    private String nick;
    private String password;
    private String name;

    public Person() {
        this.nick = randomPersonNickFromFile();
        this.password = randomDiffFrom5To10ForPassword();
        this.name = randomName();
    }

    public Person(String nick, String password, String name) {
        this.nick = nick;
        this.password = password;
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
