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
}
