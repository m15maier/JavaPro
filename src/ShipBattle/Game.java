package ShipBattle;

import java.util.Scanner;

public class Game {
    private MessagePrinter messagePrinter;
    private Scanner scanner;
    private final static int CountOfShots = 10;

    public Game(MessagePrinter messagePrinter, Scanner scanner) {
        this.messagePrinter = messagePrinter;
        this.scanner = scanner;
    }

        public void start(Field field) {
            int count = 0;
            messagePrinter.printStartInfo();
            for (int i = 0; i < CountOfShots; i++) {
                messagePrinter.printInfo();
                int row = scanner.nextInt();
                messagePrinter.printSecondNumber();
                int column = scanner.nextInt();

                boolean result = field.checkCell(row, column);

                if (result) {
                    messagePrinter.printWinMessage();
                    count++;
                } else {
                    messagePrinter.printLoseMessage();
                }
            }
            messagePrinter.printEndGame();
        }
    }

