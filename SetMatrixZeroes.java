class Solution {
    public void setZeroes(int[][] matrix) {
    // Brute Force 
    // :- i)Traverse the matrix and for each '0' element, set its entire row and column as '-1.
       // ii) Traverse matrix again and set each '-1' as 0.
    // TC : O(N*M)(N+M) + O(N*M) ~ O(N^3)
    // SC : O(1)
    
    // The above solution won't work for a matrix that contains numbers < 0. 


    // Better Solution Using O(M+N) extra space
    // TC : O(2*(NM))

    int n = matrix.length;
    int m = matrix[0].length;

    int[] row = new int[n]; // to track if a row would be marked as 0
    int[] col = new int[m]; // to track if a col would be marked as 0

    // Traverse the matrix and if even a single element of a row or column is '0' mark the row and col arrays for future reference

    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            if(matrix[i][j]==0){
                col[j] = 1;   // this complete column would be set to 0
                row[i] = 1;   // this complete row would be set to 0
            }
        }
    }

    for(int i=0;i<n;i++){
        for(int j=0;j<m; j++){
            if(row[i] == 1 || col[j] == 1){
                matrix[i][j] = 0;
            }
        }
    }
      
    }
}