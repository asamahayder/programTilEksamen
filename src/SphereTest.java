import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class SphereTest {
    double radius = Math.random()*Double.MAX_VALUE;
    double specifikRadius = 5;
    Sphere sphere = new Sphere(radius);
    Sphere specifikSphere =new Sphere(specifikRadius);

    @Test
    public void omkredsSpecifik() {
        double omkreds = specifikSphere.omkreds();
        assertEquals(31.4159,omkreds,0.0001);
    }

    @org.junit.Test
    public void omkredsGenerel() {
        double omkreds = sphere.omkreds();
        assertEquals(2*radius*Math.PI,omkreds,0.0001);
    }

    @org.junit.Test
    public void rumfang() {
        double rumfang = specifikSphere.rumfang();
        assertEquals(523.599,rumfang,0.001);

    }

    @org.junit.Test
    public void overfladeareal() {
        double overfladeareal = specifikSphere.overfladeareal();
        assertEquals(314.159,overfladeareal,0.001);
    }
}