import java.awt.*;

public class MarsRover {

    Coordinates coordinates;
    Direction direction;

    public MarsRover(Point value, String n) {
        coordinates = new Coordinates(value);
        direction = new Direction(n);
    }

    public void updateCoordinates(Point value) {
        coordinates.setCoord(value);
    }

    public void updateDirection(String n) {
        direction.setDirection(n);
    }

    public Point getStartingPoint() {
        return coordinates.getCoord();
    }

    public String getDirection() {
        return direction.getDirection();
    }
}
