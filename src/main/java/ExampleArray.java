import java.util.Arrays;

public class ExampleArray {

    public static String[] justArrayOfStrings = {"Test0", "Test1", "Test2", "Test3", "Test4", "Test5", "Test6", "Test7", "Test8", "Test9"};
    public static int[] justArrayOfInt = {-1, 10, 15, 7, 9, 100, 0};

    public static void findElementOfArray() {
        for (int i = 0; i < justArrayOfStrings.length; i++) {
            if (justArrayOfStrings[i].equals("Test5")) {
                System.out.println("Элемент " + justArrayOfStrings[i] + " найден под номером " + i);
            }
        }
    }

    public static void sortElementOfArrayByArrays() {
        Arrays.sort(justArrayOfInt);
        System.out.println(Arrays.toString(justArrayOfInt));
    }
}
