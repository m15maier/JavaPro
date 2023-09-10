package ShipBattle;

import java.util.Arrays;

public class Field {

    private Cell[][] cells;

    public Field(Cell[][] cells) {
        this.cells = cells;
    }
public boolean checkCell(int row, int column) {
        Cell targetCell = cells[row][column];
        return targetCell.isFree();
}

    public Cell[][] gelCells() {
        return cells;
    }

    public void setColor(Cell[][] cells) {
        this.cells = cells;
    }



    @Override
    public String toString() {
        return "ShipBattle.Field{" +
                "cells=" + Arrays.deepToString(cells) +
                '}';
    }
}
