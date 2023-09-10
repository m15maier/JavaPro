import ShipBattle.Cell;

import java.util.Arrays;

public class Field {

    private Cell[][] cells;

    public Field(Cell[][] cells) {
        this.cells = cells;
    }

    public Cell[][] gelCells() {
        return cells;
    }

    public void setColor(Cell[][] cells) {
        this.cells = cells;
    }

    @Override
    public String toString() {
        return "Field{" +
                "cells=" + Arrays.deepToString(cells) +
                '}';
    }
}
