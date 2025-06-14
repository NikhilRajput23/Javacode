public class circle {
    private double radius;

    public double getRadius() { return radius; }
    public void setRadius(double r) { radius = r; }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        circle c = new circle();
        c.setRadius(5);
        System.out.println(c.calculateArea());
        System.out.println( c.calculatePerimeter());
    }
}