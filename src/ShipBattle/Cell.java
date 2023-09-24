package ShipBattle;
public class Cell {

    private boolean isFree;
    public Cell(boolean isFree) {
        this.isFree = isFree;
    }
    public boolean isFree() {
        return isFree;
    }
    public void setFree(boolean free) {
        isFree = free;
}

    @Override
    public String toString() {
        if (isFree) {
        return "\uD83D\uDEA2";
        }
        else {
            return "";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cell)) return false;

        Cell cell = (Cell) o;

        return isFree == cell.isFree;
    }

    @Override
    public int hashCode() {
        return (isFree ? 1 : 0);
    }
}
