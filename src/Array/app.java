package Array;

import java.util.*;

public class app {
    public static void main(String[] args) {

        GenericArray arr = new GenericArray();


        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.print();

        Object[] arrToAddInt = {9,9,9,9,9};

        System.out.println("-------addAtPosition-------");
        arr.addAtPosition(1, 40);
        arr.addAtPosition(2, 40);
        arr.print();
        System.out.println("-------remove&removeByIndex-------");
        arr.removeByIndex(2);
        arr.remove(40);

        arr.print();

        System.out.println("-------addAll-------");

        arr.addAll(6, arrToAddInt);
        arr.print();

        System.out.println("-------removeRange-------");
        arr.removeRange(6, 9);
        arr.print();

        System.out.println("-------add StringArr-------");
        arr.addAll(6,arrToAddInt);
        arr.print();


        System.out.println("-------Iterator-------");
        Iterator iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}