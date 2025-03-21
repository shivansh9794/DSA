package String.Exercise;

public class reverseString {


    public static String reverseOfString(String s) {
        // code here
        String result="";
        for(int i=s.length()-1;i>=0;i--){
         result+=Character.toString(s.charAt(i));
        }
        return result;
    }


    public static void main(String[] args) {

        String s="Geeks";

        System.out.print("Common Way : ");
        for(int i=s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }

        System.out.println();
        System.out.print("New Way : ");
        System.out.println(reverseOfString(s));

    }
}