/**
 * "Reverse a String"
 */
public class Solution {

    public static void main(String[] args) {
        String str = "pawarprathamesh";
        reverseString("", str);
    }
  
    static void reverseString(String p , String up){
    
    if(up.length() == 1) {
        return;
    }
      int n = up.length() -1;  
      char ch = up.charAt(n);

      reverseString(p + ch, up.substring(1, n));

    }
}