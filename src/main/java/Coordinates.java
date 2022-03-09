import java.awt.*;

public class Coordinates {

    private Point coord;


    public Coordinates(Point value) {
        setCoord(value);
    }

    public void setCoord(Point value) {
        coord = value;
    }

    public Point getCoord() {
        return coord;
    }
}
