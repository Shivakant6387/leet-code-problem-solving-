package java17;

public class Exam3 {
    public static void main(String[] args) {
        testFooBar("Hello");
        testFooBar2(null);
    }

    public static void testFooBar(String s) {
        if (s == null) {
            System.out.println("null");
            return;
        }
        switch (s) {
            case "Foo", "Bar" -> System.out.println("Correct!");
            default -> System.out.println("Ok!");
        }
    }

    public static void testFooBar2(String s) {

        switch (s) {
            case null -> System.out.println("null");
            case "Foo", "Bar" -> System.out.println("Correct!");
            default -> System.out.println("Ok!");
        }
    }
}
