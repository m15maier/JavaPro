package Homework_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    // 1) Создайте ArrayList, заполните его 100 случайными значениями, используя библиотеку Random
    public static void main(String[] args) {
        List<Integer> list = generateList();

        System.out.println(list);

        min(list);
        max(list);
    }

    public static List<Integer> generateList() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(100);
            list.add(randomNumber);
        }
        return list;
    }

// Выведите все элементы списка, которые больше предыдущего элемента этого же списка.
// Пример, если список выглядит так - 1 5 2 4 3, То мы выведем - 5 4

    public static void max(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i - 1)) {

                System.out.println("Большее: " + list.get(i));
            }
        }
    }

// 2) Выведите значение наименьшего из всех положительных элементов в списке
// Пример, если список выглядит так - 5 -4 3 -2 1, То мы выведем - 1

public static void min(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (Integer integer : list) {
            if (integer > 0 && integer < min) {
                min = integer;

                System.out.println("Меньшее: " + min);
            }
        }
    }



}