import java.io.*;
import java.util.ArrayList;

public class ArrayListSearchIndexOf {
    
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> num= new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        

        System.out.print("enter element to be searched in List : ");
        int n=Integer.parseInt(br.readLine());

        int idx=num.indexOf(n);

        if(idx==-1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element "+n+" Found in List");
        }
    }
}
