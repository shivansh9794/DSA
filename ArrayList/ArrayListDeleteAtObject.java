import java.util.*;

public class ArrayListDeleteAtObject {
    public static void main(String[] args) {
        
        ArrayList<String> num = new ArrayList<String>(Arrays.asList("a","b","c","d","e"));

        num.remove(2);

        System.out.println(num);


        num.remove("b");


        System.out.println(num);
    }
}
