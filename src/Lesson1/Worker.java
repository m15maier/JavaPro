package Lesson1;

import java.util.Objects;

public class Worker extends Person {
    private int minSalary;
    private int maxSalary;

    public Worker(String name, int age, int height, int weight, int money, int minSalary, int maxSalary) {
        super(name, age, height, weight, money);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии ");
    }

    @Override
    public void die(int years) {
        System.out.println("Этот человек не доживет до пенсии и умрет через" + years + "лет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;

        Worker worker = (Worker) o;

        if (minSalary != worker.minSalary) return false;
        return maxSalary == worker.maxSalary;
    }

    @Override
    public int hashCode() {
        int result = minSalary;
        result = 31 * result + maxSalary;
        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", years=" + years +
                '}';
    }
}
