public class numofZeros {
      public static void main(String[] args) {
          int n = 102000;
       
          int ans = numofZeros(n);
          System.out.println(ans);
        }

      
    
      static int numofZeros(int n){
     
        return helper(n, 0);
        
      }

      static int helper(int n , int count){
        if(n == 0){
            return count;
        }
         
        int rem = n%10;
        if(rem == 0){
            return helper(n/10, count+1);
        }
          return helper(n/10, count);
      }
}
