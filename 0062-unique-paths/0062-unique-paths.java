class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr=new int[m][n];

        for(int i=0;i<n;i++){
            arr[0][i]=1;
        } 
        for(int j=0;j<m;j++){
            arr[j][0]=1;
        }
        for(int k=1;k<m;k++){
            for(int l=1;l<n;l++){
                arr[k][l]=arr[k-1][l]+arr[k][l-1];
            }
        }
        return arr[m-1][n-1]; 
    }
}