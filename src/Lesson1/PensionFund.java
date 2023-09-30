package Lesson1;

import java.util.List;

public class PensionFund {

    private String name;
    private boolean state;
    private final String date;
    private List<Worker> persons;


    public List<Worker> getPersons() {
        return persons;
    }

    public void setPersons(List<Worker> persons) {
        this.persons = persons;
    }

    public PensionFund(String name, boolean state, String date, int users) {
        this.name = name;
        this.state = state;
        this.date = date;
        this.persons = persons;
    }


    public String getName() {
        return name;
    }
    private boolean isTrue() {
        return state;
    }

    private String getDate() {
        return date;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setTrue(boolean aTrue) {
        state = aTrue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PensionFund)) return false;

        PensionFund that = (PensionFund) o;

        return persons.equals(that.persons);
    }

    @Override
    public int hashCode() {
        return persons.hashCode();
    }

    public void info() {
        System.out.println("Называние фонда: " + name);

        int count = (persons != null) ? persons.size() : 0;

        if (state) {
            System.out.println("Количество участников: " + persons.size() / 1000 + " тысяч человек");
        } else {
            System.out.println("Количество участников: " + persons.size() + " человек");
        }
    }

    public double calculatePensionFor(AbleToCalculatePension obj) {
        if (state) {
            return obj.calculatePension();
        } else {
            System.out.println("Деньги из фонда украли.");
            return 0.0;
        }
    }

    public double calculateMedianPension() {
        if (persons == null || persons.size() == 0) {
            return 0.0;
        }
        double sum = 0.0;

        for (Worker worker : persons) {
            sum += calculatePensionFor(worker);
        }
        return sum / persons.size();
    }
}
