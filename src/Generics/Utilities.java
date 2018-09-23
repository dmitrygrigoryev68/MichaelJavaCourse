package Generics;

import java.util.List;

public class Utilities {
    // parameterized
    public static <T> void fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++)
            list.set(i, val);
    }

    // wild card, unknown object
    public static void printList(List<?> list) {
        for (Object l : list)
            System.out.println("{" + l + "}");
    }
}