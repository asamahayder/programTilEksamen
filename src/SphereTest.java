import static org.junit.Assert.*;

public class SphereTest {

    @org.junit.Test
    public void omkreds() {
        Sphere sphere = new Sphere(5);
        double omkreds = sphere.omkreds();
        assertEquals(31.4159,omkreds,0.0001);

    }

    @org.junit.Test
    public void rumfang() {

    }

    @org.junit.Test
    public void overfladeareal() {
    }
}