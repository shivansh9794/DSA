package TwoD;

import java.util.Arrays;

public class twoD1_define {
    public static void main(String[] args) {

        int [][] arr = new int[2][2];

        arr[0][0]=2;
        arr[0][1]=3;
        arr[1][0]=4;
        arr[1][1]=5;

        System.out.println(Arrays.deepToString(arr));

        String [][]ar = {{"a","b"},{"c","d"}};

        System.out.println(Arrays.deepToString(ar));

    }
}
