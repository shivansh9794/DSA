public class array2_initialize {
    
    
    int arr[]=null;

    public array2_initialize(int size){
        arr=new int[size];

        for(int i=0; i<arr.length; i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    

    public void insert(int loccation, int value){
        try{

            if(arr[loccation]==Integer.MIN_VALUE){
                arr[loccation]=value;
                System.out.println("successfully inserted");
            }
            else{
                System.out.println("this sell is already occupied");
            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index to access array");
        }
    }
    
    public static void main(String[] args) {
        array2_initialize a= new array2_initialize(5);
        a.insert(0, 5);
        a.insert(1, 6);
        a.insert(2, 7);
        a.insert(1, 8);
        a.insert(4, 9);
        a.insert(5, 10);
    }
}
           
