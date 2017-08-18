package mars.rover;

import mars.rover.exception.LessThanZeroException;
import mars.rover.models.Position;
import mars.rover.models.Direction;
import mars.rover.models.Plateau;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {

        int topX, topY;
        int x = 0, y = 0;
        Direction direction;

        try {
            Scanner scanner = new Scanner(System.in);

            String instructionsList;
            String topPosition = scanner.nextLine();
            String topXY[] = topPosition.split(" ");

            topX = Integer.parseInt(topXY[0]);
            topY = Integer.parseInt(topXY[1]);

            if(topX < 0 || topY < 0) {
                  throw new LessThanZeroException("Number Less Than Zero Not Allowed");
            }

            Plateau plateau = new Plateau(topX, topY);

            for (int i = 0; i < 2; i++) {
                String s = scanner.nextLine();
                String CurrentPosition[] = s.split(" ");

                x = Integer.parseInt(CurrentPosition[0]);
                y = Integer.parseInt(CurrentPosition[1]);

                if(x < 0 || y < 0) {
                    throw new LessThanZeroException("Number Less Than Zero Not Allowed");
                }

                direction = Direction.valueOf(CurrentPosition[2]);
                Position position = new Position(x, y, direction);

                MarsRover marsRover = new MarsRover(position, plateau);
                instructionsList = scanner.nextLine();
                marsRover.runCommands(instructionsList);

                System.out.println(marsRover.getCurrentPosition());
            }
        } catch (LessThanZeroException e) {
            System.out.println(e.getMessage());
        }
        catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}
