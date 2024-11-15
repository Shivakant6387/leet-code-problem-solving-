package java17;

public class Exam4 {
    public static void main(String[] args) {
        Shape shape = new Triangle(10, 20);
        testTriangle(shape);
    }

    public static void testTriangle(Shape shape) {
        switch (shape) {

            case Triangle triangle -> System.out.println("Small triangle");

            default -> System.out.println("non triangle");
        }
    }
//    public static void testTriangle(Shape shape) {
//        switch (shape) {
//            case null:
//                break;
//            case Triangle triangle:
//                if (triangle.calculateArea() > 100) {
//                    System.out.println("Large triangle");
//                    break;
//                }
//            default:
//                System.out.println("A shape : possibly a small triangle");
//        }
//    }
}
