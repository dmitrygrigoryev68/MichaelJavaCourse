package Array;

import java.util.Iterator;

public class app {
    public static void main(String[] args) {
        Array arr = new Array();

        int[] arrToAdd = {7, 8, 9};

        int[] arrToAddFrom = {10, 11, 12, 13, 14,15,16,17,18,19};

        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);


        arr.addAtPosition(2, 40);
        arr.print();
        arr.remove(40);
        arr.print();

        arr.addAll(arrToAdd);
        arr.print();
        arr.addAll(10 , arrToAddFrom);
        arr.print();
        arr.removeRange(19, 120);
        arr.print();
        arr.removeByIndex(3);


        Iterator iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
