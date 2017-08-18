package mars.rover.parser;

import mars.rover.commands.Move;
import mars.rover.commands.Command;
import mars.rover.commands.Left;
import mars.rover.commands.Right;
import mars.rover.models.Plateau;

import java.util.ArrayList;
import java.util.List;

public class Parser {

        public static List<Command> generateCommand(String commands, Plateau plateau) {
        List<Command> commandList = new ArrayList<Command>();
        for (int i = 0; i < commands.length(); i++) {
            switch (commands.charAt(i)) {
                case 'L':
                    commandList.add(new Left());
                    break;
                case 'R':
                    commandList.add(new Right());
                    break;
                case 'M':
                    commandList.add(new Move(plateau));
                    break;
            }
        }
        return commandList;
    }
}
