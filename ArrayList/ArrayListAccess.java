import java.util.ArrayList;

public class ArrayListAccess {
    
    public static void main(String[] args) {
        
        ArrayList<Character> l = new ArrayList<>();

        l.add('a');
        l.add('b');
        l.add('c');
        l.add('d');
        l.add('e');

        // For Accessing whole ArrayList 
        System.out.println(l);

        //For Accessing Specific Index In ArrayList
        System.out.println("["+l.get(3)+"]");

    }
}
