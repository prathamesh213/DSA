// Q. FInd ith bit of a number.
// Find the ith bit of an int 
public class bitwiseq3 {
    
    public static void main(String[] args) {
        int i = 4;
        int k = 3;
        System.out.println(ithBit(i, k));
    }
      
    static int ithBit(int i, int k){
      
        int op = 1 << (k-1);         
        return i & op;
        
    }
}
