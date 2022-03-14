public class lab502 {

    public static void main(String[] args) {

        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6, 4);
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("The perimeter of r1: " + p1.getPerimeter());
        System.out.println("The area of r1: " + p1.getArea());
        System.out.println("The perimeter of r2: " + p2.getPerimeter());
        System.out.println("The area of r2: " + p2.getArea());
        System.out.println("The perimeter of r3: " + p3.getPerimeter());
        System.out.println("The area of r3: " + p3.getArea());
    }

}
