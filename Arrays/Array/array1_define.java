import java.util.Arrays; 
import ArrayTraverse;

public class array1_define{
    
    public static void main(String[] args) {
     
        ArrayTraverse arrt = new ArrayTraverse();
        int intArray[]= new int[3];

        intArray[0]=1;
        intArray[1]=2;
        intArray[2]=3;

        arrt.print(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
