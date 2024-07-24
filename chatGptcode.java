public class chatGptcode {
    
    
        public static void main(String[] args) {
            int n = 14;
            int ans = numofSteps(n, 0);
            System.out.println(ans);
        }
        
        static int numofSteps(int n, int count) {
            if (n == 0) {
                return count;
            }
            int parity = evenorOdd(n);
            if (parity == 0) {
                // Corrected: Return the result of the recursive call
                return numofSteps(n / 2, count + 1);
            } else {
                return numofSteps(n - 1, count + 1);
            }
        }
    
        static int evenorOdd(int n) {
            return n & 1;
        }
    }
    
