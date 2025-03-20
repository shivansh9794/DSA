package Exercise;

public class ex4TopTwoScore {
    public static void main(String[] args) {
        
        int arr[] = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int flag=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[0] <= arr[i]) {
                int f = arr[0];
                arr[0] = arr[i];
                arr[i] = f;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[1] <= arr[i]) {
                flag = arr[1];
                arr[1] = arr[i];
                arr[i] = flag;
            }
        }
        System.out.println("");

        for (int i : arr) {
            System.out.print(i + " ");
        }

     


        int myArray[]={arr[0],arr[1]};
        int firstSecond[]=myArray;


        System.out.println("\n* First, Second best scores from the Array : *");
        for (int i : firstSecond) {
            System.out.print(i + " ");
        }
    }

}
