package ShipBattle;

import java.util.Random;

public class FieldGenerator {
    private static final int SizeOfField = 10;
    private static final int Percents = 100;
    private static final int SuccessPercent = 50;

    public Field generateField() {
        Random random = new Random();

        Cell[][] cells = new Cell[SizeOfField][SizeOfField];

        for (int i =0; i < SizeOfField; i++) {
            for (int j = 0; j< SizeOfField; j++) {
                int number = random.nextInt(Percents); // 0-99
                boolean isShip = (number < SuccessPercent); // true, сли будет значение от 0 до 9
                cells[i][j] = new Cell(isShip);
            }
        }
        Field field = new Field(cells);
        return field;
    }
}
