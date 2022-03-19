import java.awt.*;

public class Move {

    public Move(MarsRover marsRover, String move) {

        Point coord = marsRover.getStartingPoint();
        double x = coord.getX();
        double y = coord.getY();
        String direction = marsRover.getDirection();

        switch (move) {
            case "f":
                switch (direction) {
                    case "N" -> {
                        if(y == 5) {
                            y = 1;
                        } else {
                            y += 1;
                        }
                        coord.setLocation(x, y);
                        marsRover.updateCoordinates(coord);
                    }
                    case "E" -> {
                        if(x == 5) {
                            x = 1;
                        } else {
                            x += 1;
                        }
                        coord.setLocation(x, y);
                        marsRover.updateCoordinates(coord);
                    }
                    case "S" -> {
                        if(y == 1) {
                            y = 5;
                        } else {
                            y -= 1;
                        }
                        coord.setLocation(x, y);
                        marsRover.updateCoordinates(coord);
                    }
                    case "W" -> {
                        if(x == 1) {
                            x = 5;
                        } else {
                            x -= 1;
                        }
                        coord.setLocation(x, y);
                        marsRover.updateCoordinates(coord);
                    }
                }
                break;
            case "b":
                switch (direction) {
                    case "N" -> {
                        if(y == 1) {
                            y = 5;
                        } else {
                            y -= 1;
                        }
                        coord.setLocation(x, y);
                        marsRover.updateCoordinates(coord);
                    }
                    case "E" -> {
                        if(x == 1) {
                            x = 5;
                        } else {
                            x -= 1;
                        }
                        coord.setLocation(x, y);
                        marsRover.updateCoordinates(coord);
                    }
                    case "S" -> {
                        if(y == 5) {
                            y = 1;
                        } else {
                            y += 1;
                        }
                        coord.setLocation(x, y);
                        marsRover.updateCoordinates(coord);
                    }
                    case "W" -> {
                        if(x == 5) {
                            x = 1;
                        } else {
                            x += 1;
                        }
                        coord.setLocation(x, y);
                        marsRover.updateCoordinates(coord);
                    }
                }
                break;
            case "r":
                switch (direction) {
                    case "N" -> marsRover.updateDirection("E");
                    case "E" -> marsRover.updateDirection("S");
                    case "S" -> marsRover.updateDirection("W");
                    case "W" -> marsRover.updateDirection("N");
                }
                break;
            case "l":
                switch (direction) {
                    case "N" -> marsRover.updateDirection("W");
                    case "W" -> marsRover.updateDirection("S");
                    case "S" -> marsRover.updateDirection("E");
                    case "E" -> marsRover.updateDirection("N");
                }
                break;
        }
    }
}
