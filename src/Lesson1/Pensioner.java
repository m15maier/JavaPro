package Lesson1;

public class Pensioner extends Person {
    private double pensioner;

    public Pensioner(String name, int age, int height, int weight, int money, double pension, Gender Gender) {
        super(name, age, height, weight, money, Gender);
        this.pensioner = pension;
    }

    public double getPensioner() {
        return pensioner;
    }

    public void setPensioner(double pensioner) {
        this.pensioner = pensioner;
    }

    @Override
    public void AbleToCalculatePension() {

    }

    @Override
    public void die() {
        System.out.println("Этот пенсионер умер, он заработал: " + (getAge() - 50) + pensioner);
    }

    @Override
    public abstract die(int years) {
        System.out.println("Этот пенсионер умрет через" + years + "лет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pensioner)) return false;

        Pensioner pensioner1 = (Pensioner) o;

        return Double.compare(pensioner1.pensioner, pensioner) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(pensioner);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Pensioner{" +
                "pensioner=" + pensioner +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", years=" + years +
                '}';
    }
}
