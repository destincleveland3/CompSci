public class RectangleTester {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(4, 5);
        Rectangle q = new Rectangle(6, 7);
        double d = a.calculateDiagonal();
        double s = a.calculateArea();
        double f = a.calculatePerimeter();
        double g = a.getLength();
        double h = a.getWidth();
        String v = a.toString();
        boolean t = a.equals(q);
        System.out.println("Length: " + g);
        System.out.println("Width: " + h);
        System.out.println("Area: " + s);
        System.out.println("Diagonal: " + d);
        System.out.println("Perimeter " + f);
        System.out.println(v);
        System.out.println("Equal: " + t);
    }
}
