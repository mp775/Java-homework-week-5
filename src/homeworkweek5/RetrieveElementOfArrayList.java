package homeworkweek5;
/**Write a Java program to retrieve an element (at a specified index) from a given array list
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RetrieveElementOfArrayList {
    public static void main(String[] args) {
       indexOfArray();
    }
    public static void indexOfArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Index number :" );
        int number = scanner.nextInt();


       List list = new ArrayList();
        list.add("Martin");
        list.add("Joan");
        list.add("Donna");
        list.add("George");
        list.add("Dane");
        System.out.println(" the element on index number in the Arraylist is :"  +  list.get(number));
    }

}
