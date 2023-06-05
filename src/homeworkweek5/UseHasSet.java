package homeworkweek5;
/**Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets. Show which numbers between 1 and 10 are in the set. (Hint: use for loop
 *  and if else) */

import java.util.HashSet;

public class UseHasSet {
    public static void main(String[] args) {
        setNumber();
    }
    public static void setNumber(){
        HashSet<Integer>numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for(int i = 1; i<= 10; i++){
            if (numbers. contains(i)){
                System.out.println("number " + i + " is found in the set.");

            }else {
                System.out.println("number " + i + " is not found in the set.");
            }

        }

    }
}
