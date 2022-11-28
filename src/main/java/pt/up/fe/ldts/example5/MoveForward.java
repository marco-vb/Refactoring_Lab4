package pt.up.fe.ldts.example5;

public class MoveForward extends Command {

    public MoveForward(Position position) {
        super(position);
    }

    public Position execute(char command) {
        if (getPosition().getDirection() == 'N') getPosition().setRow(getPosition().getRow() - 1);
        else if (getPosition().getDirection() == 'E') getPosition().setColumn(getPosition().getColumn() + 1);
        else if (getPosition().getDirection() == 'S') getPosition().setRow(getPosition().getRow() + 1);
        else if (getPosition().getDirection() == 'W') getPosition().setColumn(getPosition().getColumn() - 1);
        return getPosition();
    }
}
