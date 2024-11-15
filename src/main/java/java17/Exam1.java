package java17;

public class Exam1 {
    public static void main(String[] args) {
        System.out.println(formatter(2.0));
    }

    public static String formatter(Object object) {
        String formatted = "unknown";
        if (object instanceof Integer integer) {
            formatted = String.format("int %d", integer);
        } else if (object instanceof Long l) {
            formatted = String.format("Long %d", l);
        } else if (object instanceof Double d) {
            formatted = String.format("Double %f", d);
        } else if (object instanceof String s) {
            formatted = String.format("String %s", s);
        }
        return formatted;
    }
}
