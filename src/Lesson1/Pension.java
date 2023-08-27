package Lesson1;

import java.util.Date;

public class Pension {

    String name;
    boolean state;
    Date date;
    int users;

    public Pension(String name, boolean state, Date date, int users) {
        this.name = name;
        this.state = state;
        this.date = date;
        this.users = users;
    }


    public String getName() {
        return name;
    }

    private boolean isTrue() {
        return state;
    }

    private Date getDate() {
        return date;
    }

    private int getUsers() {
        return users;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setTrue(boolean aTrue) {
        state = aTrue;
    }

    private void setUsers(int users) {
        this.users = users;
    }

    public void info() {
        System.out.println("Называние фонда: " + name);
        System.out.println("Дата создания: " + date);
    }

    public void go() {
        if (state == true) {
            System.out.println("Фонд государственный");
            System.out.println("Количество участников: " + users);
        }
        else {
            System.out.println("Количество участников: " + users);
        }
    }
}
