public class array6_delete {
    
    static void delete(int arr[], int index){
        arr[index]=Integer.MIN_VALUE;
        System.out.println("element deleted succesfully at index ["+index+"]");
    }

    static void print(int arr[]){

        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
            }

    }

    public static void main(String[] args) {

        
        int arr[]={1,2,3,4,5};
        delete(arr, 4);
        delete(arr, 0);
        System.out.print("available values in a array are :- [");
        print(arr);
        System.out.print(" ]");
    
    }
}

