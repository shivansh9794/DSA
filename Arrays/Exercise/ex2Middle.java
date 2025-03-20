package Exercise;

import java.util.Arrays;

public class ex2Middle {
    

    public static int[] middle(int[] array) {

        // TODO
        int arr[]=new int[(array.length)-2];
        
        for(int i=1; i<array.length-1; i++){
            arr[i-1]=array[i];
        }
        
        return arr;
        
    }


    public static void main(String[] args) {
        int array[]= {1,3,4,7,12,5};
        
        int arry[]=middle(array);

        System.out.println(Arrays.toString(arry));
        
    }

}



