package Lesson1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PensionFund {

    private String name;
    private boolean state;
    private boolean date;
    private List<Worker> persons;


    public List<Worker> getPersons() {
        return persons;
    }

    public void setPersons(List<Worker> persons) {
        this.persons = persons;
    }


    public PensionFund(String name, boolean state, boolean date, int users) {
        this.name = name;
        this.state = state;
        this.date = date;
        this.persons = persons;


//       1. В пенсионный фонд поле добавьте Map, которая будет содержать в себе дни недели (как ключ) и
//       булеан переменную, как значение. Данное поле будет обозначать, работает ли сегодня пенсионный фонд.

        double basePension;
        Map<String, Boolean> shedule = new HashMap<String, Boolean>();

        shedule.put("Monday", true);
        shedule.put("Tuesday", true);
        shedule.put("Wednesday", true);
        shedule.put("Thursday", true);
        shedule.put("Friday", true);
        shedule.put("Saturday", false);
        shedule.put("Sunday", false);


        LocalDate dateToday = LocalDate.now(); // получаем текущую дату
        int year = dateToday.getYear();
        int month = dateToday.getMonthValue();
        int dayOfMonth = dateToday.getDayOfMonth();
        DayOfWeek dayOfWeek = dateToday.getDayOfWeek();
        System.out.println(date);
        System.out.println(dayOfWeek);

    }





        public String getName() {
        return name;
    }
    private boolean isTrue() {
        return state;
    }

    private boolean getDate() {
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
        }
        else {
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



//       2. В логику рассчета пенсии в пенсионном фонде добавьте проверку дня недели.
//       Если сегодня пенсионный фонд не работает (узнать это можно сравнив текущий день недели и день недели из мапы), тогда пенсия равна 0.

    public double calculatePension(AbleToCalculatePension obj) {
        if (date == true) {
            return obj.calculatePension();
        }
        else {
            System.out.println("0 ");
            return 0.0;
        }
    }


}





