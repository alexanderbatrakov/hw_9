import java.util.HashMap;

public class ExampleMap {
    public static HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

    public static void addElementsOfHashMap() {
        hashMap.put("Сергей", 23);
        hashMap.put("Павел", 18);
        hashMap.put("Николай", 89);
        hashMap.put("Петр", 1);
        hashMap.put("Алексей", 16);
        hashMap.put("Александр", 10);
        hashMap.put("Дмитрий", 35);
        hashMap.put("Вячеслав", 50);
        System.out.println(hashMap.toString());
    }

    public static void findElementOfHashMap() {
        if (hashMap.containsKey("Алексей")) {
            System.out.println("Элемент Алексей содержит ключ " + hashMap.get("Алексей"));
        } else {
            System.out.println("Элемент не найден");
        }
    }

    public static void deleteElementOfHashMap() {
        hashMap.remove("Дмитирй");
        do {
            System.out.println("Элемент Дмитрий удален!");
            break;
        }
        while (hashMap.containsKey("Дмитрий"));
    }
}
