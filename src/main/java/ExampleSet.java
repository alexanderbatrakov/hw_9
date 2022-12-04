import java.util.HashSet;
import java.util.Iterator;

public class ExampleSet {
    public static HashSet<String> hashSet = new HashSet<String>();


    public static void addElementsOfHashSet() {
        hashSet.add("TestHS0");
        hashSet.add("TestHS1");
        hashSet.add("TestHS2");
        hashSet.add("TestHS3");
        hashSet.add("TestHS4");
        hashSet.add("TestHS5");
        hashSet.add("TestHS6");
        hashSet.add("TestHS7");
        hashSet.add("TestHS8");
        hashSet.add("TestHS9");
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void findElementOfHashSet() {
        if (hashSet.contains("TestHS3")) {
            System.out.println("Элемент TestHS3 найден!");
        } else {
            System.out.println("Элемент TestHS3 не найден!");
        }
    }

    public static void deleteElementOfHashSet() {
        if (hashSet.remove("TestHS0")) {
            System.out.println("Элемент TestHS0 удален!");
        } else {
            System.out.println("Элемент TestHS0 не найден!");
        }
    }
}
