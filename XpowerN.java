public class XpowerN {
    public static void main(String[] args) {
        System.out.println(power(2, 4));

    }
     
    static int power(int x, int n){
             
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int xnm1 = power(x, n-1);
        int xn =  x * xnm1;

        return xn;
      

    }
    
}
