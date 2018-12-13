public class Main {
    public static void main(String[] args) {

        Sphere sphere = new Sphere(5);

        System.out.println("den valgte radius er: " + sphere.radius);

        System.out.println("rumfanget: " + sphere.rumfang());

        System.out.println("overfladearealet: " + sphere.overfladeareal());

        System.out.println("omkreds: " + sphere.omkreds());
    }
}
