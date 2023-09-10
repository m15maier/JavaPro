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
        } else {
            return "";
        }
    }
}
