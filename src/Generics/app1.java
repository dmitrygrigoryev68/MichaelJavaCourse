package Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class app1 {
    public static void main(String[] args) {
        BoxPrinter boxPrinter = new BoxPrinter(new Integer(10));
        System.out.println(boxPrinter);
        Integer intValue1 = (Integer) boxPrinter.getValue();
        BoxPrinter boxPrinter2 = new BoxPrinter("Hello world");
        System.out.println(boxPrinter);

        // Runtime exception
        Integer intValue2 = (Integer) boxPrinter.getValue();

        BoxPrinterGen<Integer> boxPrinterGen = new BoxPrinterGen<Integer>(new Integer(10));
        System.out.println(boxPrinterGen);
        Integer intValueGen1 = boxPrinterGen.getValue();
        BoxPrinterGen<String> boxPrinterGen2 = new BoxPrinterGen<String>("Hello world");
        System.out.println(boxPrinterGen2);

        // Compilation error
        // Integer intValueGen2 = boxPrinterGen2.getValue();

        // usage with interface
        BoxPrinterGen<PrinterInterface> interfaceBoxPrinterGen = new BoxPrinterGen<>(new PrinterClass());
        PrinterInterface printerInterface = interfaceBoxPrinterGen.getValue();
        printerInterface.print();

        /* diamond syntax
        List list = new LinkedList();
        list.add("First");
        list.add("Second");
        // Runtime exception
        list.add(10);
        // unchecked assignment
        List<String> list2 = list;
        for (Iterator<String> itemItr = list2.iterator(); itemItr.hasNext(); )
            System.out.println(itemItr.next());*/

        // compiler will replace <> on the right side with correct type
        List<String> listG = new LinkedList<>();
        listG.add("First");
        listG.add("Second");
        // Compilation error
        // listG.add(10);
        List<String> list2G = listG;
        for (Iterator<String> itemItr = list2G.iterator(); itemItr.hasNext(); )
            System.out.println(itemItr.next());

        // generics methods
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        System.out.println("Before: " + intList);
        Utilities.fill(intList, 0);
        System.out.println("After: "
                + intList);

        // method with wild-card <?>
        List<Integer> intArrList = new ArrayList<>();
        intArrList.add(10);
        intArrList.add(100);
        Utilities.printList(intList);
        List<String> strArrList = new ArrayList<>();
        strArrList.add("10");
        strArrList.add("100");
        Utilities.printList(strArrList);
    }

    // Last two wont be complied because it is not type safe. Even if the types are inherited from each other.
    // you can use abstract classes, interfaces ar parent classes in the left side of assignment, but you can't
    // assign one type to another. It is like to say that String = Integer
    // List<Number> list = new ArrayList<Integer>();
    // List<Integer> list = new ArrayList<Number>();
}