package ShipBattle;

public class MessagePrinter {

    public void printStartInfo() {
        System.out.println("Игра началась");
        System.out.println("_____________");
    }
    public void printInfo() {
        System.out.println("Введите число: ");

    }
    public void printSecondNumber() {
        System.out.println("Введите второе число");
    }

    public void printWinMessage() {
        System.out.println("Молодец");
    }

    public void printLoseMessage() {
        System.out.println("Обидно");
    }

    public void printEndGame() {
        System.out.println("Вы поразили " + value + " целей");
    }
}
