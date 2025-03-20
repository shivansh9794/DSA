package Exercise;

import java.util.Arrays;

class ex3Diagonal{
    public static void main(String[] args) {


        int arr [][]= {{1,2,3,55},{4,5,6,66},{7,8,9,77},{10,11,12,90}};

        System.out.println(Arrays.deepToString(arr));


        int sum=0;
        

        for(int i=0; i<arr.length; i++){
           
               // System.out.println(arr[i][i]);
                sum=sum+arr[i][i];
                           
        }

            System.out.println("sum is a : "+sum);

    }
}