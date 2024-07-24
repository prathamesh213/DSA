public class factorialRecursive {
   public static void main(String[] args) {
       int n = 5;
      System.out.println(factorical(n));
   }
   
   static int factorical(int n){
   if(n==1){
      return 1;
   }
   int fact = n * factorical(n-1);
   return fact;
}
}
