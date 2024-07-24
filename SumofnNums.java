public class SumofnNums {
    public static void main(String[] args) {
        int n = 5;
        int sum = n*(n+1)/2;
        System.out.println(sum);    
        
        System.out.println(sumofNums(n));
    }

    static int sumofNums(int n){
        if(n<=1){
            return 1;
        }
        int sum = n +  sumofNums(n-1);
        
        return sum;
    }


}

