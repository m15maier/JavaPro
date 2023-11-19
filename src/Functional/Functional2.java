package Functional;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;

public class Functional2 {
    public static void main(String[] args) {

// 1) Functional. Принимает строку, находит в ней самый часто встречаемый символ и отдает ее

        Function<String, Character> findMostFrequentChar = (str) -> {
            Map<Character, Integer>
                    charCount = new HashMap<>();
            char mostFrequentChar = ' ';
            int maxCount = 0;

            for (char c : str.toCharArray()) {
                int count = charCount.getOrDefault(c, 0) + 1;
                charCount.put(c, count);
                if (count > maxCount) {
                    maxCount = count;
                    mostFrequentChar = c;
                }
            }
            return mostFrequentChar;
        };
        String input = "Hello, world!";
        System.out.println("Most frequent character: " + findMostFrequentChar.apply(input));
    }



// 2) Supplier. Ничего не принимает, отдает случайно сгенерированную строку

    public class RandomStringGenerator {
        public static void main(String[] args) {
            Random random = new Random();
            int N = random.nextInt(101); // Генерируем случайное число от 0 до 100
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < N; i++) {
                int randomNumber = random.nextInt(26); // Генерируем случайное число от 0 до 25
                char randomChar = (char) ('A' + randomNumber); // Преобразуем число в букву (A=0, B=1, ..., Z=25)
                sb.append(randomChar);
            }

            String randomString = sb.toString();
            System.out.println("Randomly generated string: " + randomString);

            // Создаем HashMap для преобразования числа в букву
            Map<Integer, Character> numberToCharMap = new HashMap<>();
            for (int i = 0; i < 26; i++) {
                numberToCharMap.put(i, (char) ('A' + i));
            }

            // Преобразуем каждую цифру в строке в букву
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < randomString.length(); i++) {
                char c = randomString.charAt(i);
                int number = c - 'A'; // Преобразуем букву в число
                char mappedChar = numberToCharMap.get(number);
                result.append(mappedChar);
            }

            String finalString = result.toString();
            System.out.println("Mapped string: " + finalString);
        }
    }

}
