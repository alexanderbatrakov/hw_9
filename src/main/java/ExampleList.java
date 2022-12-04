import java.util.ArrayList;

public class ExampleList {
    public static ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public static void addElementsOfArrayList() {
        arrayList.add(5);
        arrayList.add(99);
        arrayList.add(-12);
        arrayList.add(0);
        arrayList.add(98);
        arrayList.add(9);
        arrayList.add(8);
        arrayList.add(35);
        arrayList.add(4);
        arrayList.add(121);
        for (Integer elementOfArray : arrayList) {
            System.out.print(elementOfArray + " ");
        }
        System.out.println();
    }

    public static void findElementOfArrayList() {
        if (arrayList.contains(-12)) {
            System.out.println("Элемент -12 найден!");
        } else {
            System.out.println("Элемент -12 не найден!");
        }
    }

    public static void deleteElementOfArrayList() {
        arrayList.remove(4);
        System.out.println(arrayList.toString());
    }

}


