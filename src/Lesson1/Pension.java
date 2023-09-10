package Lesson1;

import java.util.Date;

public class Pension {

    private String name;
    private boolean state;
    private Date date;
    private int users;

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
        if (state) {
            System.out.println("Фонд государственный");
            System.out.println("Количество участников: " + users / 1000 + " тысяч человек");
        }
        else {
            System.out.println("Количество участников: " + users + " человек");
        }
    }

    private double calculatePensionFor(AbleToCalculatePension) {
        if (state) {
            AbleToCalculatePension person = null;
            return person.calculatePension();
        } else {
            return 0;
            System.out.println("Деньги из фонда украли.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pension)) return false;

        Pension pension = (Pension) o;

        if (state != pension.state) return false;
        if (users != pension.users) return false;
        if (!name.equals(pension.name)) return false;
        return date.equals(pension.date);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (state ? 1 : 0);
        result = 31 * result + date.hashCode();
        result = 31 * result + users;
        return result;
    }

    @Override
    public String toString() {
        return "Pension{" +
                "name='" + name + '\'' +
                ", state=" + state +
                ", date=" + date +
                ", users=" + users +
                '}';
    }
}
