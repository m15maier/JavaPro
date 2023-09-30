package Lesson1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Worker alice = new Worker();
        alice.setMinSalary(1000);
        alice.setMaxSalary(5000);
        alice.setGender(Gender.FEMALE);

        Worker alex = new Worker();
        alex.setMinSalary(1200);
        alex.setMaxSalary(5200);
        alex.setGender(Gender.MALE);

        List<Worker> workerList = new ArrayList<>();
        workerList.add(alice);
        workerList.add(alex);



        PensionFund pensionFund1 = new PensionFund("Pension1", true, "2000", 200000);
        PensionFund pensionFund2 = new PensionFund("Pension2", false, "2005", 300000);


        double stateFundAveragePension = pensionFund1.calculateMedianPension();
        double notStateAveragePension = pensionFund2.calculateMedianPension();

        System.out.println(stateFundAveragePension);
        System.out.println(notStateAveragePension);
    }
}



