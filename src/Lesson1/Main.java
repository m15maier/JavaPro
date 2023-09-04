package Lesson1;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 19, 170, 45, 3000);
        Person person2 = new Person("Alex", 73, 180, 85, 4000);

        person1.info();
        person1.go();

        System.out.println("  ");

        person2.info();
        person2.go();

        person1.setMoney(5000);
        System.out.println("Money: " + person1.getMoney());

        System.out.println("  ");
        System.out.println(" --- Задание 2 ---");
        System.out.println(" ");

        Pension pension1 = new Pension("Pension1", true, new Date(2020-01-01), 200000);
        Pension pension2 = new Pension("Pension2", false, new Date(2021-02-02), 300000);
        Pension pension3 = new Pension("Pension3", true, new Date(2022-03-03), 400000);

        pension1.info();
        pension1.go();

        System.out.println(" ");

        pension2.info();
        pension2.go();

        System.out.println(" ");

        pension3.info();
        pension3.go();
    }
}
