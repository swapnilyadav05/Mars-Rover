package mars.rover;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import mars.rover.models.Direction;
import mars.rover.models.Plateau;
import mars.rover.models.Position;


public class MarsRoverTest extends TestCase  {

    public MarsRoverTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( MarsRoverTest.class );
    }

    public void testRunCommand()
    {
        Plateau plateau = new Plateau(5, 5);
        Position position = new Position(1, 2, Direction.N);
        MarsRover marsRover = new MarsRover(position, plateau);
        String commands = "LMLMLMLMM";
        marsRover.runCommands(commands);
        assertTrue(marsRover.getCurrentPosition().equals(new Position(1, 3, Direction.N)));
    }

    public void testRunCommandForSecondR()
    {
        Plateau plateau = new Plateau(5, 5);
        Position position = new Position(3, 3, Direction.E);
        MarsRover marsRover = new MarsRover(position, plateau);
        String commands = "MMRMMRMRRM";
        marsRover.runCommands(commands);
        assertTrue(marsRover.getCurrentPosition().equals(new Position(5, 1, Direction.E)));
    }

    public void testRunCommandWithSingleCommand()
    {
        Plateau plateau = new Plateau(5, 5);
        Position position = new Position(1, 2, Direction.N);
        MarsRover marsRover = new MarsRover(position, plateau);
        String commands = "L";
        marsRover.runCommands(commands);
        assertTrue(marsRover.getCurrentPosition().equals(new Position(1, 2, Direction.W)));
    }

    public void testRunCommandWithEmptyCommand()
    {
        Plateau plateau = new Plateau(5, 5);
        Position position = new Position(1, 2, Direction.N);
        MarsRover marsRover = new MarsRover(position, plateau);
        String commands = "";
        marsRover.runCommands(commands);
        assertTrue(marsRover.getCurrentPosition().equals(new Position(1, 2, Direction.N)));
    }


    public void testRunCommandWithUnknownCommands()
    {
        Plateau plateau = new Plateau(5, 5);
        Position position = new Position(1, 2, Direction.N);
        MarsRover marsRover = new MarsRover(position, plateau);
        String commands = "ABCD";
        marsRover.runCommands(commands);
        assertTrue(marsRover.getCurrentPosition().equals(new Position(1, 2, Direction.N)));
    }


}
