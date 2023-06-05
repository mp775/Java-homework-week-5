package homeworkweek5;

import java.util.ArrayList;

/**11. Declare following two arrylist and compare it.
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink")**/

public class CompareTwoArrayList {
    public void compareList(){
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        ArrayList<String> c3 = new ArrayList<String>();
        for (String l : c1)
            c3.add(c2.contains(l)? " Yes "  : "No");

        System.out.println(c3);

    }


    public static void main(String[] args) {
        CompareTwoArrayList l1 = new CompareTwoArrayList();
        l1.compareList();
    }
}
