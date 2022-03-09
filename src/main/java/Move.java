import java.awt.*;

public class Move {

    public Move(MarsRover marsRover, String move) {

        Point coord = marsRover.getStartingPoint();
        double x = coord.getX();
        double y = coord.getY();

        if(move.equals("f")) {
            x += 1;
            coord.setLocation(x, y);
            marsRover.updateCoordinates(coord);
        } else if(move.equals("b")) {
            x -= 1;
            coord.setLocation(x, y);
            marsRover.updateCoordinates(coord);
        }
    }
}
