package homeworkweek5;
/**Write a Java program to create a new array list, add some colours (string) and printout the collection using for each loop.
*/

import java.util.ArrayList;
import java.util.List;

public class CreateArrayList {
    public static void main(String[] args) {
listOfColour();
    }
    public static void listOfColour(){
        List<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");
        list.add("Orange");
        for (int i = 0; i < list.lastIndexOf(list); i++) {
        }
        System.out.println(list);
    }

}
