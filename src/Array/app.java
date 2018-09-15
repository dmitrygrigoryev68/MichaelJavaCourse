package Array;

import java.util.Iterator;

public class app {
    public static void main(String[] args) {
        Array arr = new Array();

        int[] arrToAdd = {91, 92, 93, 94};

        int[] arrToAddFrom = {21, 22, 23, 24};

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
        arr.addAll(3, arrToAddFrom);
        arr.print();
        arr.removeRange(3, 5);
        arr.print();
        arr.removeByIndex(3);


        Iterator iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
