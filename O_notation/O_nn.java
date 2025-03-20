// Most inefficient O Notation because it takes much more time to complete .


package O_notation;

class O_nn{
    
    static void printNumber(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println(i+" "+j);
            }
        }
    } 

    public static void main(String[] args) {
        printNumber(9);
    }
}
