public class Sphere {
    double radius;

    Sphere(double radius){
        this.radius = radius;
    }

    public double rumfang(){
        double rumfang = (4.0/3.0)*Math.PI*Math.pow(radius,3);
        return rumfang;
    }

    public double overfladeareal(){
        double overfladeareal = 4*Math.PI*Math.pow(radius, 2);
        return overfladeareal;
    }
}
