import java.awt.*;

public class Move {

    public Move(MarsRover marsRover, String move) {

        Point coord = marsRover.getStartingPoint();
        double x = coord.getX();
        double y = coord.getY();
        String direction = marsRover.getDirection();

        if(move.equals("f")) {
            x += 1;
            coord.setLocation(x, y);
            marsRover.updateCoordinates(coord);
        } else if(move.equals("b")) {
            x -= 1;
            coord.setLocation(x, y);
            marsRover.updateCoordinates(coord);
        } else if(move.equals("r")) {
            switch (direction) {
                case "N" -> marsRover.updateDirection("E");
                case "E" -> marsRover.updateDirection("S");
                case "S" -> marsRover.updateDirection("W");
                case "W" -> marsRover.updateDirection("N");
            }
        } else if(move.equals("l")) {
            switch (direction) {
                case "N" -> marsRover.updateDirection("W");
                case "W" -> marsRover.updateDirection("S");
                case "S" -> marsRover.updateDirection("E");
                case "E" -> marsRover.updateDirection("N");
            }
        }
    }
}
