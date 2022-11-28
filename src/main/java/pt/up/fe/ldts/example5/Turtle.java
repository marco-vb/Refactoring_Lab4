package pt.up.fe.ldts.example5;

public class Turtle {
    private Position position;

    public Turtle(int row, int column, char direction) {
        this.position = new Position(row, column, direction);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public char getDirection() {
        return position.getDirection();
    }

    public int getRow() {
        return position.getRow();
    }

    public int getColumn() {
        return position.getColumn();
    }

    public void execute(char command) {
        if (command == 'F')  setPosition(new MoveForward(position).execute(command));
        else if (command == 'L') new RotationLeft(position).execute(command);
        else if (command == 'R') new RotationRight(position).execute(command);
    }
}
