public class Point {

    private int x = 0;
    private int y = 0;
    String label = "";

    public Point(String label, int x, int y){
        this.x = x;
        this.y = y;
        this.label = label;
    }

    @Override
    public String toString(){
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }

    @Override
    public boolean equals(Object p2) {
        if (p2 instanceof Point) {
            return (x == ((Point) p2).x && y == ((Point) p2).y);
        }
        return false;
    }
}
