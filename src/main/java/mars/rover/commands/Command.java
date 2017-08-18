package mars.rover.commands;

import mars.rover.models.Position;

public interface Command {
    void move(Position position);
}
