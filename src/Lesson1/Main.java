package Lesson1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person ("Alice", 19, 170, 45, 3000, Gender.FEMALE);
        Person person2 = new Person("Alex", 73, 180, 85, 4000, Gender.MALE);

        double result = pension1.calculatePensionFor(Alice);
        System.out.println(result);

        double result = pension1.calculatePensionFor(Alex);
        System.out.println(result);

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

        PensionFund pension1 = new PensionFund("Pension1", true, new Date(2020-01-01), 200000);
        PensionFund pension2 = new PensionFund("Pension2", false, new Date(2021-02-02), 300000);
        PensionFund pension3 = new PensionFund("Pension3", true, new Date(2022-03-03), 400000);

        pension1.info();
        pension1.go();

        System.out.println(" ");

        pension2.info();
        pension2.go();

        System.out.println(" ");

        pension3.info();
        pension3.go();




        System.out.println(worker.calculatePension());
    }

    public Main() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
