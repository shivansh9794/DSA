package Basic_Ques_GFG;

public class CountDigit {

    public static int countDigits(int n) {

        // write your code here
        if(n==0){
            return 0;
        }
        int flag=0;
        while(n>0){
            flag++;
            n=n/10;
        }
        
        // return number of digits in n
        return flag;
    }


    public static void main(String[] args) {
       System.out.println(countDigits(5558));
    }
}
