class searchInMatrix{
    public static boolean searchMatrix(int[][] mat, int x) {
        // code here
        boolean y=false;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==x){
                    y=true;
                }
            }
        }

        return y;
    }

    public static void main(String[] args) {
        
        int mat[][] = {{6, 23, 21},{4, 45, 32},{69, 11, 87}};
        int x=92;

        System.out.println(searchMatrix(mat,x));
    }
}