package mars.rover.commands;

import mars.rover.models.Direction;
import mars.rover.models.Position;

public class Left implements Command {

    public void move(Position position) {
        switch(position.getDirection()){
            case E:
                position.setDirection(Direction.N);
                break;
            case W:
                position.setDirection(Direction.S);
                break;
            case N:
                position.setDirection(Direction.W);
                break;
            case S:
                position.setDirection(Direction.E);
        }
    }

}
