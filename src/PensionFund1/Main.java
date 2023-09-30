package PensionFund1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //1) Создайте тип данных, описывающий различные профессии в формате enum (перечисления). Профессии (для примера):
        // строитель, программист, слесарь
        //
        //2) Создайте новое поле в классе Worker - множество профессий, на которых успел поработать человек. (тип данных - Set)
        //
        //3) В методе рассчета пенсии добавьте новый коэффициент. к финальной рассчитанной пенсии добавляется 5%
        // за каждые три профессии. Соответственно, если человек поработал на 9 профессиях, то его бонус составит 15% к пенсии.



        Worker anna = new Worker();
        alice.setMinSalary(1000);
        alice.setMaxSalary(5000);
        alice.setGender(Gender.FEMALE);

        Worker daniil = new Worker();
        alex.setMinSalary(2000);
        alex.setMaxSalary(50000);
        alex.setGender(Gender.MALE);

        List<Worker> workerList = new ArrayList<>();
        workerList.add(anna);
        workerList.add(daniil);



        PensionFund pensionFund1 = new PensionFund("Pension1", true, "2000", 200000);
        PensionFund pensionFund2 = new PensionFund("Pension2", false, "2005", 300000);


        double stateFundAveragePension = pensionFund1.calculateMedianPension();
        double notStateAveragePension = pensionFund2.calculateMedianPension();

        System.out.println(stateFundAveragePension);
        System.out.println(notStateAveragePension);
    }
}



