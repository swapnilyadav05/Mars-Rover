package mars.rover.commands;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import mars.rover.models.Direction;
import mars.rover.models.Position;

public class LeftTest extends TestCase {
    public LeftTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( LeftTest.class );
    }

    public void testMoveWithDirectionN()
    {
        Position position = new Position(1, 2, Direction.N);
        Command command = new Left();
        command.move(position);
        assertTrue(position.getDirection().equals(Direction.W));
    }

    public void testMoveWithDirectionW()
    {
        Position position = new Position(1, 2, Direction.W);
        Command command = new Left();
        command.move(position);
        assertTrue(position.getDirection().equals(Direction.S));
    }

    public void testMoveWithDirectionS()
    {
        Position position = new Position(1, 2, Direction.S);
        Command command = new Left();
        command.move(position);
        assertTrue(position.getDirection().equals(Direction.E));
    }

    public void testMoveWithDirectionE()
    {
        Position position = new Position(1, 2, Direction.E);
        Command command = new Left();
        command.move(position);
        assertTrue(position.getDirection().equals(Direction.N));
    }
}
