package pt.up.fe.ldts.example5;

public class RotationRight extends Command {

    public RotationRight(Position position) {
        super(position);
    }

    public Position execute(char command) {
        if (getPosition().getDirection() == 'N') getPosition().setDirection('E');
        else if (getPosition().getDirection() == 'E') getPosition().setDirection('S');
        else if (getPosition().getDirection() == 'S') getPosition().setDirection('W');
        else if (getPosition().getDirection() == 'W') getPosition().setDirection('N');

        return getPosition();
    }
}
