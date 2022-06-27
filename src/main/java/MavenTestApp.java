import org.apache.commons.lang3.ArrayUtils;

public class MavenTestApp {
    public static void main(String[] args) {
        System.out.println("Hello World :)");

        String[] array ={"a", "b", "c"};
        String[] array2 = ArrayUtils.add(array, "d");

        System.out.println(ArrayUtils.toString(array));
        System.out.println(ArrayUtils.toString(array2));
        System.out.println(ArrayUtils.isSameLength(array, array2));
    }
}
