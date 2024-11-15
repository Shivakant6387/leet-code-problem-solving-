package java17;

public class Exam5 {
    public static void main(String[] args) {
        typeTester(new Point(1, 3));
    }

    public static void typeTester(Object o) {
        switch (o) {
            case null -> System.out.println("null");
            case String s -> System.out.println("String");
            case Color color -> System.out.println("Color with " + color.values().length + " values");
            case Point point -> System.out.println("Record Class" + point.toString());
            case int[] ai -> System.out.println("Array of int with length" + ai.length);
            default -> System.out.println("none of them");
        }
    }
}
