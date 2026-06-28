class Solution {
    public int uniquePaths(int m, int n) {
        int[][] mat=new int[m][n];
        for(int i=0; i<n;i++){ //fill the first 0th rowwith 1
            mat[0][i]=1;
        }
        for(int i=0;i<m;i++){  //fill 0th col with 1
            mat[i][0]=1;
        }
        for(int i=1;i<m;i++){  //complete the mat from 1,1 to m-1,n-1
            for(int j=1;j<n;j++){
                mat[i][j]=mat[i][j-1]+mat[i-1][j];
            }
        }
        return mat[m-1][n-1];
    }
}