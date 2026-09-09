class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int rows = mat.length;
        int cols = mat[0].length;

        // Cannot reshape
        if (rows * cols != r * c) {
            return mat;
        }

        int[][] ans = new int[r][c];

        // int k = 0;
        int a=0,b=0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                ans[a][b] = mat[i][j];
                b++;
                if(b==c){
                    b=0;
                    a++;
                }
            }
        }

        return ans;
    }
}