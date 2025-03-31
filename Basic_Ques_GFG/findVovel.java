package Basic_Ques_GFG;

public class findVovel {

    public static void isVowel(char c){
        if(c=='a'|| c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
            System.out.println("Vowel");
        } 
        else{
            System.out.println("Not a Vowel");
        }
        
    } 
    public static void main(String[] args) {
        
        isVowel('a');
        isVowel('c');

    }
}
