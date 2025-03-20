package Exercise;
import java.io.*;


public class ex1temp {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("how many days Temprature : ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        int avg=0,max=0;
        for(int i=0; i<arr.length; i++){
            System.out.print("day "+(i+1)+" temprature : ");
            arr[i]=Integer.parseInt(br.readLine());
            avg=avg+arr[i];
        }
        avg=avg/arr.length;
        System.out.println("Average temprature is : "+avg+"°C");

        for(int i=0; i<arr.length; i++){
            if(arr[i]>avg){
                max++;
            }
        }
        System.out.println("Days obove average temprature : "+max);
    }
}
