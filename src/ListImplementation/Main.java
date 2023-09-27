package ListImplementation;

import java.util.ArrayList;

public class Main {
public static void main(String[]args){

    // arrayList
    // в основе лежит массив
    // когда массив переполняется, создаём массив в 1,5 раза больше
    // начальный размер массива = 10
    // все элеметны имеют индексы

    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    MyArrayList a = new MyArrayList();

    arrayList.add(1);
    a.add(1);
    a.add(2);
    a.add(100);

    System.out.println(a);
}
}