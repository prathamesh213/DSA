
import java.util.ArrayList;

 public class Permutaions {
    public static void main(String[] args) {

       System.out.println( allPermutationsCount("", "abc"));
        
    }

   public static void allPermutations(String p , String up){  
    if (up.length() == 0) {
        System.out.println(p);
        return;
    }
    char ch = up.charAt(0); 
    for(int i = 0 ; i<= p.length(); i++){
        String first = p.substring(0, i);
        String second= p.substring(i, p.length());
        
        allPermutations(first + ch + second, up.substring(1));
    }
    }

    public static ArrayList<String> PermutationsArray(String p , String up){  
        if (up.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0); 
        for(int i = 0 ; i<= p.length(); i++){
            String first = p.substring(0, i);
            String second= p.substring(i, p.length());
            
            ans.addAll(PermutationsArray(first + ch + second, up.substring(1)));
        }
        return ans;
        }
        
     static int allPermutationsCount(String p , String up){  
            if (up.length() == 0) {
            return 1;
            }
            int count = 0;

            char ch = up.charAt(0); 
            for(int i = 0 ; i<= p.length(); i++){
                String first = p.substring(0, i);
                String second= p.substring(i, p.length());
                
                count = count + allPermutationsCount(first + ch + second, up.substring(1));
                
            }
           return count;    
        }


}
