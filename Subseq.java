
import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
     subsets("", "abc");
     
     ArrayList<String> list = new ArrayList<>();   
     method2("", "abc", list);
     System.out.println(list);
     
     System.out.println(method3("", "abc"));

    }

static void subsets(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
     
    char ch = up.charAt(0);

    subsets(p + ch, up.substring(1));
    subsets(p , up.substring(1));    
}

static void subsetsRet(String p, String up){

    if(up.isEmpty()){
        System.out.println(p);
        return;
    }
 
char ch = up.charAt(0);

subsets(p + ch, up.substring(1));
subsets(p , up.substring(1));    
}

// Method 2 ArrayList.


static void method2(String p, String up,ArrayList<String> list){
    if (up.isEmpty()) {
      list.add(p);
      return;
    } 

    char ch = up.charAt(0);
    method2(p + ch, up.substring(1), list);
    method2(p, up.substring(1), list); 
}

static ArrayList<String> method3(String p , String up){
   
    if (up.isEmpty()) {
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
    }

    char ch = up.charAt(0);

   ArrayList<String> left = method3(p + ch, up.substring(1));
   ArrayList<String> right = method3(p , up.substring(1));
  
   left.addAll(right);
   return left;
}

    
}
