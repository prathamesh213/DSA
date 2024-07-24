public class SumofDigits {
    public static void main(String[] args) {
        int n =1352;
        System.out.println(Digitsum(n));
    }

    static int Digitsum(int n){
       if(n==0){
        return 0;
       }
        return  n%10 + Digitsum(n/10);
    }
}
