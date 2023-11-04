package PensionFund1;

import java.util.Objects;
import java.util.Set;

public class Worker extends Person implements AbleToCalculatePension {

    private final static double PENSION_COEFFICIENT = 0.25;
    private final static double ADDITIONAL_COEFFICIENT = 0.05;

    private final static int COUNT_OF_PROFS = 3;

    private int minSalary;

    private int maxSalary;

    private Set<Proffession> proffessions;

    public Worker(String name, int age, double weight, int height) {
        super(name, age, weight, height);
    }

    public Worker(String name, double weight, int height) {
        super(name, 0, weight, height);
    }

    public Worker() {
        super(null, 0, 0, 0);
    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    @Override
    public void die(int years) {
        System.out.println("Этот человек не доживет до пенсии и умрет через " + years + "лет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return minSalary == worker.minSalary && maxSalary == worker.maxSalary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minSalary, maxSalary);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
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

    public Set<Proffession> getProffessions() {
        return proffessions;
    }

    public void setProffessions(Set<Proffession> proffessions) {
        this.proffessions = proffessions;
    }

    @Override
    public double calculatePension() {
        Gender gender = getGender();

        if (gender == null) {
            return 0.0;
        }

        double averageSalary;

        if (gender.equals(Gender.MALE)) {
            averageSalary = CalculatorUtils.calculateAverage(minSalary, maxSalary);
        }
        else {
            averageSalary = CalculatorUtils.calculateAverage(minSalary / 2, maxSalary * 2);
        }

        double additionalMoney = 0.0;

        if (proffessions != null) {
            int countProffessions = proffessions.size();
            additionalMoney = countProffessions / COUNT_OF_PROFS * ADDITIONAL_COEFFICIENT;
        }

        //0.05


        //return averageSalary * PENSION_COEFFICIENT + (averageSalary * PENSION_COEFFICIENT * additionalMoney);
        return averageSalary * PENSION_COEFFICIENT * (1 + additionalMoney);
    }
}