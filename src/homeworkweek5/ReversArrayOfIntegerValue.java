package homeworkweek5;

/**Write a Java program to reverse an array of integer values.*/

import java.util.Arrays;

public class ReversArrayOfIntegerValue {
    public static void main(String[] args) {
        ReversArrayOfIntegerValue obj =new ReversArrayOfIntegerValue();
        obj.reversArray();
    }
    public void reversArray(){
        int [] array1 ={ 300,450,650,200,250,700,650,850,};
        System.out.println("Original array:"+ Arrays.toString(array1));
        for (int i = 0 ; i<array1.length/2; i++){
            int temp = array1[i];
            array1[i]=array1[array1.length-i-1];
            array1[array1.length-i-1]=temp;

        }
        System.out.println(" Reverse array:"+Arrays.toString(array1));
    }

}
