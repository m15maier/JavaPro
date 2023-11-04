package PensionFund1;

import java.util.Objects;

public abstract class Person {

    private String name;

    private int age;

    private double weight;

    private int height;

    private double money;

    private Gender gender;

    private Person dad;

    public Person(String name, int age, double weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public Person() {

    }

    public void printInfo() {
        System.out.println("Имя человека " + name);
        System.out.println("Возраст человека " + age);
    }

    public void goToWork() {
        if (age < 18 || age > 70) {
            System.out.println("Отдыхаю");
        }
        else {
            System.out.println("Вот блин... работа");
        }
    }

    public void die() {
        System.out.println("Человек погиб");
    }

    public abstract void die(int years);

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person getDad() {
        return dad;
    }

    public void setDad(Person dad) {
        this.dad = dad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.weight, weight) == 0 && height == person.height && Double.compare(person.money, money) == 0 && Objects.equals(name, person.name) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, height, money, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", money=" + money +
                ", gender=" + gender +
                '}';
    }


}