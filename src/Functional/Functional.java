package Functional;

//В отдельном проекте создайте несколько реализаций функциональных интерфейсов с помощью лямбда выражений

import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Functional {

    public static void main(String[] args) {

//  1) Functional. Принимает строку, а отдает ее размер

        Function <String, Integer>
                stringLength = (str) -> str.length();

        String input = "Hello";
        int length = stringLength.apply(input);
        System.out.println("Length" + input + "is:" + length);
    }

//  2) BinaryOperator - принимает две строки, отдает строку - результат сложения двух строк

public class Binary {
    public static void main(String[] args) {

        BinaryOperator<String>
                concatString = (str1, str2) -> str1 + str2;

        String imput1 = "Hello";
        String imput2 = "World";

        String result = concatString.apply(imput1, imput2);
        System.out.println("String" + result);
        }
    }

// 3) Supplier. Ничего не принимает, отдает случайно сгенерированное число


public class Supplier {
    public static void main(String[] args) {

        Supplier<Integer> randomInteger = () -> new Random().nextInt();

        int result = randomInteger.get();
        System.out.println("Random integer" + result);

    }
}

// 4) Consumer. Принимает число, пишет на экран "привет" количество раз, равное числу

public class PrintHello {
    public static void main(String[] args) {

       Consumer<Integer> printHello = (num) -> {
           for (int i = 0; i < num; i++) {
               System.out.println("Привет");
           }
       };
        PrintHello.accept(5);
    }
}

}
