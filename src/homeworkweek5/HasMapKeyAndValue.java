package homeworkweek5;
/**Create a HashMap object called people that will store String keys and Integer values: And use for each loop to iterate the value from Map*/

import java.util.HashMap;

public class HasMapKeyAndValue {
    public static void main(String[] args) {
        HashMap<String,Integer> People = new HashMap<String,Integer>();
        People.put("shweta",32);
        People.put("Banshri" ,26);
        People.put("Truple", 27);
        People.put("Shaiphali",34);
        for(String i : People.keySet()){
            System.out.println(("key: "+i+ " value " + People.get(i)));
        }

    }

}
