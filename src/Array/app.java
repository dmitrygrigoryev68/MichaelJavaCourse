package Array;

import java.util.*;

public class app {
    public static void main(String[] args) {

        GenericArray arr = new GenericArray();

        List<Integer> arrToAddInt = new ArrayList();

        List<String> arrToAddStr = new LinkedList<>();

        arr.addTest("one");
        arr.addTest("two");
        arr.addTest("three");
        arr.addTest("for");
        arr.addTest("five");
        arr.addTest("six");
        arr.addTest("seven");

        arrToAddInt.add(9);
        arrToAddInt.add(9);
        arrToAddInt.add(9);
        arrToAddInt.add(9);

        arrToAddStr.add("eight");
        arrToAddStr.add("nine");
        arrToAddStr.add("ten");

        arr.print();
        System.out.println("-------addAtPosition-------");
        arr.addAtPositionTest(1, "I added this beautiful string");
        arr.addAtPositionTest(2, 40);
        arr.print();
        System.out.println("-------remove&removeByIndex-------");
        arr.removeTest("six");
        arr.removeByIndexTest(2);
        arr.print();

        System.out.println("-------addAll-------");

        arr.addAllTest(6, arrToAddStr);
        arr.print();

        System.out.println("-------removeRange-------");
        arr.removeRangeTest(6, 9);
        arr.print();

        System.out.println("-------add StringArr-------");
        arr.addAllTest(6,arrToAddStr);
        arr.print();

        System.out.println("-------Iterator-------");
        Iterator iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}