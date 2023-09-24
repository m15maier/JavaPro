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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Field)) return false;

        Field field = (Field) o;

        return Arrays.deepEquals(cells, field.cells);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(cells);
    }
}
