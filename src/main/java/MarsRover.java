import java.awt.*;

public class MarsRover {

    Coordinates coordinates;
    Direction direction;

    public MarsRover(Point value, String d) {
        coordinates = new Coordinates(value);
        direction = new Direction(d);
    }

    public void updateCoordinates(Point value) {
        coordinates.setCoord(value);
    }

    public void updateDirection(String d) {
        direction.setDirection(d);
    }

    public Point getStartingPoint() {
        return coordinates.getCoord();
    }

    public String getDirection() {
        return direction.getDirection();
    }
}
