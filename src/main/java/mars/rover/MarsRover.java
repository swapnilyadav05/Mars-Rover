package mars.rover;

import mars.rover.commands.Command;
import mars.rover.models.Position;
import mars.rover.parser.Parser;
import mars.rover.models.Plateau;

public class MarsRover {
    private Position currentPosition;
    private Plateau plateau;

    public MarsRover(Position currentPosition, Plateau plateau) {
        this.currentPosition = currentPosition;
        this.plateau = plateau;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public void runCommands(String commands) {
        for (Command command : Parser.generateCommand(commands, plateau)) {
         command.move(this.currentPosition);
        }
    }

}
