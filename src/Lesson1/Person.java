package Lesson1;

public class Person {
    String name;
    int age;
    int height;
    int weight;
    private double money;


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

    public Person(String name, int age, int height, int weight, int money) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.money = money;
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

public double money() {
        return money;
    }
}

