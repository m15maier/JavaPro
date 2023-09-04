package Lesson1;

public class Pensioner extends Person {
    private double pensioner;

    public Pensioner(String name, int age, int height, int weight, int money, double pension) {
        super(name, age, height, weight, money);
        this.pensioner = pension;
    }


    public double getPensioner() {
        return pensioner;
    }

    public void setPensioner(double pensioner) {
        this.pensioner = pensioner;
    }

    @Override
    public void die() {
        System.out.println("Этот пенсионер умер, он заработал: " + (getAge() - 50) + pensioner);
    }
}
