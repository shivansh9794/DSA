package Basic_Ques_GFG;

public class replaceZeroWithNumber {
    

    public static int convertfive(int num) {
        // Your code here

        String number="";
        while (num>0){
            int i=num%10;
            num/=10;
            if(i==0){
                i=5;
            }
            System.out.println(i);
            number+=i;
        }
        String Number="";
        for (int i=number.length()-1; i>=0; i--) {
            Number+=number.charAt(i);
        }

        return Integer.parseInt(Number);
    }

    public static void main(String[] args) {
        int number=40006;

        System.out.println(convertfive(number));
        
    }
}
