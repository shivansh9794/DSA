import java.util.*;

public class ArrayListDeleteAtIndex {
    

    public static void main(String[] args) {
         
        ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

        System.out.println("Before Delete : "+num);
        num.remove(1);
        System.out.println("After Delete : "+num);

    }
}
