package pt.up.fe.ldts.example5;

public class RotationLeft extends Command {

    public RotationLeft(Position position) {
        super(position);
    }

    public Position execute(char command) {
        if (getPosition().getDirection() == 'N') getPosition().setDirection('W');
        else if (getPosition().getDirection() == 'W') getPosition().setDirection('S');
        else if (getPosition().getDirection() == 'S') getPosition().setDirection('E');
        else if (getPosition().getDirection() == 'E') getPosition().setDirection('N');

        return getPosition();
    }
}
