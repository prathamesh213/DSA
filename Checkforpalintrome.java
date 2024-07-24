public class Checkforpalintrome {
     
    public static void main(String[] args) {
        String str = "niddin";
        System.out.println(checkforPalintrome(str));
    }

    static boolean checkforPalintrome(String str){
     int s= 0;
     int e= str.length() - 1;
     
     while (s < e) {
        if(str.charAt(s) == str.charAt(e)){
            s++;
            e--;
        }else{
            return false;
        }
     }
        
     return true;

    }
}
