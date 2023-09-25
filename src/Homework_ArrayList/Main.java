package Homework_ArrayList;
import java.util.ArrayList;
import java.util.Random;

public class Main {

// 1) Создайте ArrayList, заполните его 100 случайными значениями, используя библиотеку Random
        public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

// Выведите все элементы списка, которые больше предыдущего элемента этого же списка.
// Пример, если список выглядит так - 1 5 2 4 3, То мы выведем - 5 4

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i - 1)) {
                System.out.println(list.get(i) + " ");
            }
        }

// 2) Выведите значение наименьшего из всех положительных элементов в списке
// Пример, если список выглядит так - 5 -4 3 -2 1, То мы выведем - 1

            for (int i = 0; i < 100; i++) {
                list.add(random.nextInt(100) - 50);
            }

            int minPositive = Integer.MAX_VALUE;

            for (int i = 0; i < list.size(); i++) {
                int element = list.get(i);
                if (element > 0 && element < minPositive) {
                    minPositive = element;
                }
            }
            System.out.println("Наименьший положительсный элемент " + minPositive);
    }
}
