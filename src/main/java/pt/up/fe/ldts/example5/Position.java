package pt.up.fe.ldts.example5;

public class Position {
    private int row;
    private int column;

    private char direction;

    public Position(int row, int column, char direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char w) {
        this.direction = w;
    }

    public void setRow(int i) {
        this.row = i;
    }

    public void setColumn(int i) {
        this.column = i;
    }
}
