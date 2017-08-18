package mars.rover.parser;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import mars.rover.commands.Command;
import mars.rover.commands.Left;
import mars.rover.commands.Move;
import mars.rover.commands.Right;
import mars.rover.models.Plateau;

import java.util.List;


public class ParserTest extends TestCase {
    public ParserTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( ParserTest.class );
    }

    public void testGenerateCommandWithSingleCommandL()
    {
        Plateau plateau = new Plateau(5, 5);
        String commands = "L";
        List<Command> commandList = Parser.generateCommand(commands, plateau);

        assertTrue(commandList.get(0) instanceof Left);
    }

    public void testGenerateCommandWithSingleCommandR()
    {
        Plateau plateau = new Plateau(5, 5);
        String commands = "R";
        List<Command> commandList = Parser.generateCommand(commands, plateau);

        assertTrue(commandList.get(0) instanceof Right);
    }

    public void testGenerateCommandWithSingleCommandM()
    {
        Plateau plateau = new Plateau(5, 5);
        String commands = "M";
        List<Command> commandList = Parser.generateCommand(commands, plateau);

        assertTrue(commandList.get(0) instanceof Move);
    }

    public void testGenerateCommandWithMultipleCommand()
    {
        Plateau plateau = new Plateau(5, 5);
        String commands = "LLMM";
        List<Command> commandList = Parser.generateCommand(commands, plateau);

        assertTrue(commandList.get(0) instanceof Left);
        assertTrue(commandList.get(1) instanceof Left);
        assertEquals(commandList.size(), 4);
    }

    public void testGenerateCommandWithEmptyCommand()
    {
        Plateau plateau = new Plateau(5, 5);
        String commands = "";
        List<Command> commandList = Parser.generateCommand(commands, plateau);

        assertTrue(commandList.isEmpty());
        assertEquals(commandList.size(), 0);
    }

}
