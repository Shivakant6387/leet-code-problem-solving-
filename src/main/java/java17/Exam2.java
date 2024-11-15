package java17;

public class Exam2 {
    public static void main(String[] args) {
        System.out.println(formatValues("Hello"));
    }

    public static String formatValues(Object o) {
        return switch (o) {
            case Integer integer -> String.format("int %d", integer);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("Double %f", d);
            case String s -> String.format("String %s", s);

            default -> o.toString();
        };
    }
}
