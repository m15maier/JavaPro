package Lesson1;

public abstract class Pensioner extends Person {
    private int pension;

    public Pensioner(String name, int age, int height, int weight, int money, double pension, Gender Gender) {
        super(name, age, height, weight, money, Gender);
    }
    @Override
    public void AbleToCalculatePension() {
    }

    @Override
    public void die() {
        System.out.println("Этот пенсионер умер, он заработал: " + (age - 50) * pension);
    }

    @Override
    public void die(int years) {
        System.out.println("Этот пенсионер умрет через" + years + "лет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pensioner)) return false;

        Pensioner pensioner1 = (Pensioner) o;
        return pension == pensioner1.pension;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(pension);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Pensioner{" +
                "pensioner=" + pension +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", years=" + years +
                '}';
    }
}
