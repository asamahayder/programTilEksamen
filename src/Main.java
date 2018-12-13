import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("vælg en radius");

        double radius = scan.nextDouble();

        Sphere sphere = new Sphere(radius);

        System.out.println("den valgte radius er: " + sphere.radius);

        System.out.println("rumfanget: " + sphere.rumfang());

        System.out.println("overfladearealet: " + sphere.overfladeareal());

        System.out.println("omkreds: " + sphere.omkreds());

    }
}
