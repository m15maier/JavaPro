package Lesson1;

public interface AbleToCalculatePension {

    public double calculatePension(); {
        if (getGender() == Person.Gender.MALE) {
            return getAge() * 1000;
        } else {
            double averageSalary = CalculatorUtils.calculateAverage(minSalary / 2, maxSalary * 2);
            return averageSalary * 0,25;
        }
    }
}
