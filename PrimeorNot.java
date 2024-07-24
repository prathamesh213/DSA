

public class PrimeorNot {
  
    public static void main(String[] args) {
        for (int i = 2; i < 40; i++) {   // time complexity of isPrime O(n)
           if(isPrime(i) == true){
             System.out.println(i);
           }
        }
        int n = 40;
        boolean[] primes = new boolean[n+1]; //O(rt(n))
        
        seive(n, primes);
         

    }

    static boolean  isPrime(int n){
       
        int c =2;
        while (c*c <= n) { 
            
            if(n % c == 0){
                return false;
          }
          c++;
        }
       return true;
    }

    static void seive(int n, boolean[] primes){

          for (int i =2; i*i<=n; i++) {
                if(!primes[i]){
                      for(int j = i*2; j<n; j+=i){
                          primes[j] = true;
                      }
                }  

          }

         for (int i = 2; i < n; i++) {
             if(!primes[i]){
                System.out.println(i);
             }
         }


    }


}
