package Lesson1;

import java.util.HashSet;
import java.util.Set;

public class Worker extends Person implements AbleToCalculatePension {

    private final static double PERCENT_OF_PENSION = 0.25;
    private int minSalary;
    private int maxSalary;

    public enum Professions {
        BUILDER,
        PROGRAMMER,
        MECHANIC,
        ARTIST,
        CHEF,
        TEACHER,
        DENTIST,
        FARMER,
        BARBER,
        PILOT
    }

    private Set<Professions> professions;


    public Worker(String name, int age, int height, int weight, double money, Gender gender, int minSalary, int maxSalary) {
        super(name, age, height, weight, money, gender);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        professions = new HashSet<>();
    }


    @Override
    public void AbleToCalculatePension() {
        int averageSalary = (minSalary + maxSalary) / 2;
        System.out.println("Средняя зарплата" + averageSalary);

        int lastPension = (averageSalary * 100 / 25);
        System.out.println("Последняя пенсия" + lastPension);

    }

    @Override
    public double calculatePension(Gender gender) {
        return 0;
    }

    public Set<Professions> getProfessions() {
        return professions;
    }

    public void setProfessions(Set<Professions> professions) {
        this.professions = professions;
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

    @Override
    public double calculatorPension() {
        Gender gender = getGender();
        if (gender == null) {
            return 0.0;
            }



        double averageSalary = 0.0;

        if (gender.equals(Gender.MALE)) {
            averageSalary = CalculatorUtils.calculateAverage(minSalary, maxSalary);
        } else {
            averageSalary = CalculatorUtils.calculateAverage(minSalary / 2, maxSalary / 2);
        }

        return averageSalary * PERCENT_OF_PENSION;


    }

    @Override
    public double calculatePension() {
        return 0;
    }
}

