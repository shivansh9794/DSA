import java.util.ArrayList;

public class ArrayListMidInsert {
   
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.add(1);
        number.add(2);
        number.add(4);
        number.add(5);

        System.out.println(number);

        number.add(2, 3);

        System.out.println(number);
    

        System.out.println("For String List :");

        
        ArrayList<String> name = new ArrayList<>();

        name.add("shivansh");
        name.add("anshika");
        name.add("shreya");
        name.add("arpita");

        System.out.println(name);

        name.add(1, "prachi");

        System.out.println(name);
    
    }
   
}
