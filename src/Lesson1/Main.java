package Lesson1;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 19, 170, 45);
        Person person2 = new Person("Alex", 73, 180, 85);

        person1.info();
        person1.go();

        person2.info();
        person2.go();
    }
}
