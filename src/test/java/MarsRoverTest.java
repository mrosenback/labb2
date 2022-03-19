import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    public void testStartingPoint() {
        assertEquals(new Point(1,4), new MarsRover(new Point(1,4), "N").getStartingPoint());
    }

    @Test
    public void testStartingDirection() {
        assertEquals("N", new MarsRover(new Point(1,1), "N").getDirection());
    }

    @Test
    public void testMovingForwardsAndBackwards() {
        MarsRover marsRover = new MarsRover(new Point(1,2), "N");

        new Move(marsRover, "f");
        assertEquals(new Point(1,3), marsRover.getStartingPoint());

        new Move(marsRover, "b");
        assertEquals(new Point(1,2), marsRover.getStartingPoint());
    }

    @Test
    public void testRotateLeftOrRight() {
        MarsRover marsRover = new MarsRover(new Point(1,2), "N");

        new Move(marsRover, "r");
        assertEquals("E", marsRover.getDirection());

        new Move(marsRover, "l");
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void testCoordinateWrapping() {
        MarsRover marsRover1 = new MarsRover(new Point(1,5), "N");
        MarsRover marsRover2 = new MarsRover(new Point(1,1), "W");
        MarsRover marsRover3 = new MarsRover(new Point(5,1), "E");
        MarsRover marsRover4 = new MarsRover(new Point(1,1), "S");

        new Move(marsRover1, "f");
        assertEquals(new Point(1,1), marsRover1.getStartingPoint());

        new Move(marsRover2, "f");
        assertEquals(new Point(5,1), marsRover2.getStartingPoint());

        new Move(marsRover3, "f");
        assertEquals(new Point(1,1), marsRover3.getStartingPoint());

        new Move(marsRover4, "f");
        assertEquals(new Point(1,5), marsRover4.getStartingPoint());
    }
}
