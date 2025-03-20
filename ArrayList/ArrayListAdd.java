import java.util.ArrayList;

class ArrayListAdd{
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>(); 

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        System.out.println(number);



        ArrayList <String> name = new ArrayList<>();

        name.add("shivansh");
        name.add("anshika");
        name.add("prachi");
        name.add("shreya");
        name.add("arpita");
        name.add(55, "hahaha");

        System.out.println(name);
    }
}