package SpyGame;

import java.util.Stack;

public class SpyGame {
    public static void main(String[] args) {
        String str = "Привет, мир";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (i % 5 == 0 && i != 0) {
                while (!stack.empty()) {
                    System.out.print(stack.pop());
                }
                System.out.print("(");
            }
            stack.push(str.charAt(i));
            if (i % 5 == 4) {
                System.out.print(")");
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
    }
}

