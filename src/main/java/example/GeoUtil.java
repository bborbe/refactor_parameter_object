package example;

public class GeoUtil {

    public double distance(double x_a, double y_a, double x_b, double y_b) {
        return x_a + x_b + y_a + y_b;
    }

    public double area(double x_a, double y_a, double x_b, double y_b, double x_c, double y_c) {
        return x_a + x_b + y_a + y_b + y_c + x_c;
    }

}
