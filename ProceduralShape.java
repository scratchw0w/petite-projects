

public class ProceduralShape {
    public static void main(String[] args){
        Square square = new Square();
        square.side = 12;
        Rectangle rectangle = new Rectangle();
        rectangle.height = 14;
        rectangle.width = 6;
        Circle circle = new Circle();
        circle.radius = 8;
        try {
            System.out.println(Geometry.area(square));
            System.out.println(Geometry.area(rectangle));
            System.out.println(Geometry.area(circle));
            System.out.println(Geometry.area(new String()));
        } catch (Exception exception) {
            System.out.println("No such shape exception..");
        }
    }
}

class Square {
    public double side;
}

class Rectangle {
    public double height;
    public double width;
}

class Circle {
    public double radius;
}

class Geometry {
    public static final double PI = 3.141592653589793;

    public static double area(Object shape) throws Exception {
        if (shape instanceof Square) {
            Square s = (Square)shape;
            return s.side * s.side;
        }
        else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle)shape;
            return r.height * r.width;
        }
        else if (shape instanceof Circle) {
            Circle c = (Circle)shape;
            return PI * c.radius * c.radius;
        }
        throw new Exception();
    }
}