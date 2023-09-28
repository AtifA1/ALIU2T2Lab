public class Point {
    private int x;
    private int y;

    public Point(int value) {
        x = value;
        y = value;
    }
    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }
    public void setY(int newY) {
        y = newY;
    }

    public String coordinate() {
        return "(x" + "," + "y)";
    }


}
