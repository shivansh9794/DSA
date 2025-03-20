package TwoD;

    
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class twoD1 {
    

    static void print(int arr[][]){
        System.out.println("Values in a array are :- "+Arrays.deepToString(arr));
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[][] = new int[2][4];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                System.out.print("Enter value at arr["+i+"]["+j+"] : ");
                String a=br.readLine();
                int n=Integer.parseInt(a);  
                arr[i][j]=n;
            }
        }

        print(arr);
    }
}
