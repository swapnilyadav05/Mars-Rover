package mars.rover.commands;

import mars.rover.models.Position;
import mars.rover.models.Plateau;

public class Move implements Command {
    private Plateau plateau;

    public Move(Plateau plateau) {
        this.plateau = plateau;
    }

    public void move(Position position) {

        switch(position.getDirection()){
            case E:
                if (plateau.getTopX() > position.getX())
                position.setX(position.getX() + 1);
                break;
            case W:
                if (plateau.getBottomX() < position.getX())
                position.setX(position.getX() - 1);
                break;
            case N:
                if (plateau.getTopY() > position.getY())
                position.setY(position.getY() + 1);
                break;
            case S:
                if (plateau.getBottomY() < position.getY())
                position.setY(position.getY() - 1);
        }
    }

}
