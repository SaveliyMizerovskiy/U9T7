public class ThreeDPoint extends Point{


    private int z = 0;
    public ThreeDPoint(String label, int x, int y, int z){
        super(label, x, y);
        this.z = z;
    }

    @Override
    public String toString(){
        return super.toString() + ", z = " + z;
    }
    @Override
    public boolean equals(Object p2){
        if (p2 instanceof Point){
            return super.equals(p2) && z == ((ThreeDPoint)p2).z;
        }
        return false;
    }
}
