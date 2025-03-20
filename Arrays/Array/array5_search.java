class array5_search{


    static void search(int arr[] ,  int n){
        
        for(int i=0; i<arr.length; i++){

            if(n==arr[i]){
                System.out.println("value found at index ["+i+"]");
                return;
            }
        }
        
        System.out.println("value "+n+" not present in array");
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        search(arr, 40);
    }

}
