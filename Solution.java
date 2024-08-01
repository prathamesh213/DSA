class Solution {
    public static void main(String[] args) {
        int[][] matrix = {  

            {1,5,9},
            {10,11,12},
            {12,13,15}
        };
        
       System.out.println(kthSmallest(matrix, 8));
    }
    
public static int kthSmallest(int[][] matrix, int k) {
    int ans= 0;
    int count = 0;
    for(int i = 0; i < matrix.length; i++) {
        int j = 0;
        while(j < matrix[i].length){
            if(count==k){
              return  matrix[i][j];
            }
        j++; count++;    
        }  

    }
   return ans;
}

}
