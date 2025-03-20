import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraverse3 {
    
    public static void main(String[] args) {

        ArrayList<Integer> num= new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        Iterator <Integer> it = num.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
}
