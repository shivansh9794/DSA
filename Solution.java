import java.util.Scanner;

class Solution {

    public static boolean isArmstrong(int num){
       
       
        int number=num;
        int no=noOfDigits(num);
        int finalNumber=0;

        while(num>0){
            int ld=num%10;
            num/=10;
            finalNumber+=pow(ld, no);
        }

        if(finalNumber==number){
            return true;
        }
        else
        {
            return false;
        }
    }


    public static int noOfDigits(int num){

        int result=0;
        
        while(num>0){
            num/=10;
            result++;
        }
        
        return result;
    } 
    

    public static int pow(int num, int power){
        
        int result=1;
        int i=0;

        while(i<power){
            result*=num;
            i++;
        }
        
        return result;

    }


    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number here :");
            int num=sc.nextInt();
            
            
            if(isArmstrong(num)==true){
                System.out.print("Number is ArmStrong");
            }
            else{
                System.out.println("Number is not ArmStrong");
            }
        }
    }
}
