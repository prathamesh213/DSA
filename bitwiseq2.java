
// Q. fiND THE DIGIT WHICH DOES NOT REPEAT ITSELF
public class bitwiseq2 {
    public static void main(String[] args) {
        int arr[] = {2,2,1,3,5,2,1,2,3};
        System.out.println((notrepeatedVal(arr)));     
    }
         
    static int notrepeatedVal(int[] arr){
        int unique = 0;
        for(int n: arr){
            unique ^= n;
        
        }

        return unique;
    }

}
