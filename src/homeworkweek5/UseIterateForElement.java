package homeworkweek5;

import java.util.ArrayList;
import java.util.ListIterator;

/**Write a Java program to iterate through all elements in an array list using Iterater. */

public class UseIterateForElement {
    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList list = new ArrayList<>();
        list.add("BMW");
        list.add(30);
        list.add("Reena");
        System.out.println("ArrayList: " + list);

        // Creating an instance of ListIterator
        ListIterator iterate = list.listIterator();
        System.out.println("Iterating over ArrayList:");
        while(iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }
    }
}