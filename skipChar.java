public class skipChar {

    public static void main(String[] args) {
   
    System.out.println( skip("", "asdsadsaa"));
    System.out.println( skipApple("apples"));
    System.out.println( skipAppNotApple("appleappaples")); 
    }

    static String skip(String p, String up){
       
        if (up.isEmpty()) {
           return p;
       }
    //    for(int i = 0; i < up.length(); i++ ){
    //           if(up.charAt(i) != 'a'){
    //             p += up.charAt(i);
    //           }    
    //         } 
     
    char ch = up.charAt(0);
 if(ch == 'a'){
       return skip(p, up.substring(1));
}
return skip(p + ch, up.substring(1));
}



//asdappleasd
public static String skipApple(String up){
   if(up.isEmpty()){
    return up;
   } 

   if (up.startsWith("apple")) {
       return skipApple(up.substring(5));
   }
   return up.charAt(0) + skipApple(up.substring(1));

}

// skip app not apple
public static String skipAppNotApple(String up){
    if(up.isEmpty()){
     return up;
    } 
 
    if (up.startsWith("app") && !up.startsWith("apple")) {
        return skipAppNotApple(up.substring(3));
    }
    return up.charAt(0) + skipAppNotApple(up.substring(1));
 
 }
}
