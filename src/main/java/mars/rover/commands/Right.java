package mars.rover.commands;

import mars.rover.models.Position;
import mars.rover.models.Direction;

public class Right implements Command {

    public void move(Position position) {
        switch(position.getDirection()){
            case E:
                position.setDirection(Direction.S);
                break;
            case W:
                position.setDirection(Direction.N);
                break;
            case N:
                position.setDirection(Direction.E);
                break;
            case S:
                position.setDirection(Direction.W);
        }
    }

}
