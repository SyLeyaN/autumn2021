public class Vector {
    private double x;
    private double y;
    private double z;

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Vector(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public Vector(){

    }

    public double myLength(){
        double result;
        result = Math.sqrt(x*x+y*y+z*z);
        return result;
    }

    public double myScalar(Vector v){
        double result;
        result = x * v.x + y * v.y + z * v.z;
        return result;
    }

    public Vector vecMulti(Vector v){
        Vector result = new Vector();
        result.x=y*v.z-z*v.y;
        result.y=z*v.x-x*v.z;
        result.z=x*v.y-y*v.x;
        return result;
    }

    public double vecCos(Vector v){
        double result;
        result=myScalar(v)/(myLength()*v.myLength());
        return result;
    }

    public Vector vecSum(Vector v){
        Vector result = new Vector();
        result.x=x+v.x;
        result.y=y+v.y;
        result.z=z+v.z;
        return result;
    }

    public Vector vecSub(Vector v){
        Vector result = new Vector();
        result.x=x-v.x;
        result.y=y-v.y;
        result.z=z-v.z;
        return result;
    }

    public static Vector[] vecMas(int n){
        Vector[] vectors = new Vector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Vector(Math.random(),Math.random(),Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
