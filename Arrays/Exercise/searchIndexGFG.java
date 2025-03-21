package Exercise;

import java.util.Scanner;

public class searchIndexGFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the Number to search in array :");
        int x=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                System.out.println("Element Found at Index :"+i);
            }
        }
    }
}
