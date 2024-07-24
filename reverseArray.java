
//Output: skeeG
public class reverseArray {
  public static void main(String[] args) {
   String str = "Geeks";
   System.out.println(ReverseString(str));
   
  }

  static String ReverseString(String str){
    String s = "";

    for (int i = str.length()-1; i >= 0; i--) {
        
        s = s+str.charAt(i);

    }   
    

    return s;
  }

}
