/*1342. Number of Steps to Reduce a Number to Zero
Easy
Topics
Companies
Hint
Given an integer num, return the number of steps to reduce it to zero.
In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
Example 1:
Input: num = 14
Output: 6
Explanation: 
Step 1) 14 is even; divide by 2 and obtain 7. 
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3. 
Step 4) 3 is odd; subtract 1 and obtain 2. 
Step 5) 2 is even; divide by 2 and obtain 1. 
Step 6) 1 is odd; subtract 1 and obtain 0. */

public class NumberOfSteps {
     
    public static void main(String[] args) {
     int n = 14;
     numberOfSteps(n);
    }
    static  int numberOfSteps(int num) {
        int count = numofSteps(num, 0);
        return count;       
    }

    static int numofSteps(int n, int count){

    if(n==0){
      return count; 
    }
    int parity = evenorOdd(n); 
    if(parity == 0){
      return numofSteps(n/2,count+1);
    }
    return numofSteps(n-1, count+1);

}

    static int evenorOdd(int n){
        
        return n&1;

}
    
}




