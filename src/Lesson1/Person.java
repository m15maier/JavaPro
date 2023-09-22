package Lesson1;

import java.util.Objects;

public abstract class Person {

    String name;
    int age;
    int height;
    int weight;
    private double money;
    int years;

    private Gender gender;

    private Person dad;

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender=" + gender +
                '}';
    }

    public abstract void die(int years);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (height != person.height) return false;
        if (weight != person.weight) return false;
        if (Double.compare(person.money, money) != 0) return false;
        if (years != person.years) return false;
        if (!Objects.equals(name, person.name)) return false;
        return gender.equals(person.gender);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + height;
        result = 31 * result + weight;
        temp = Double.doubleToLongBits(money);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + years;
        result = 31 * result + gender.hashCode();
        return result;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }





    public Person(String name, int age, int height, int weight, int money, Gender gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.money = money;
        this.gender = gender;
    }

    public void info() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Вес: " + weight);
        System.out.println("Money: " + money);
    }

    public void go() {
        if (age < 18 || age > 70) {
            System.out.println("Отдыхаю дома");
        } else {
            System.out.println("Работаю");
        }
    }

    public double money() { return money;
    }

    public abstract void AbleToCalculatePension();

    public abstract double calculatePension(Gender gender);

    public void die() {
        System.out.println("Человек погиб");
    }


    public abstract double calculatorPension();
}

