package mars.rover.commands;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import mars.rover.models.Direction;
import mars.rover.models.Plateau;
import mars.rover.models.Position;

public class MoveTest extends TestCase {
    public MoveTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( MoveTest.class );
    }

    public void testMoveWithDirectionE()
    {
        Position position = new Position(1,2, Direction.E);
        Plateau plateau = new Plateau(5,5);
        Command command = new Move(plateau);
        command.move(position);
        assertTrue(position.getX() == 2);
    }

    public void testMoveWithDirectionW()
    {
        Position position = new Position(1,2, Direction.W);
        Plateau plateau = new Plateau(5,5);
        Command command = new Move(plateau);
        command.move(position);
        assertTrue(position.getX() == 0);
    }

    public void testMoveWithDirectionN()
    {
        Position position = new Position(1, 2, Direction.N);
        Plateau plateau = new Plateau(5, 5);
        Command command = new Move(plateau);
        command.move(position);
        assertTrue(position.getY() == 3);
    }

    public void testMoveWithDirectionS()
    {
        Position position = new Position(1, 2, Direction.S);
        Plateau plateau = new Plateau(5, 5);
        Command command = new Move(plateau);
        command.move(position);
        assertTrue(position.getY() == 1);
    }

    public void testMovePlateauLimit()
    {
        Position position = new Position(5, 2, Direction.E);
        Plateau plateau = new Plateau(5, 5);
        Command command = new Move(plateau);
        command.move(position);
        assertTrue(position.getX() == 5);
    }
}
