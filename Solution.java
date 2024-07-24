//Given a string s, find the length of the longest substring without repeating characters.
//know first string then start checking next find it it's findig sent its length location
class Solution {
    public static void main(String[] args) {
    // String s = "abcabcbb";
    String s = "    ";
      System.out.println(lengthOfLongestSubstring(s));
    }

    static  int lengthOfLongestSubstring(String s) {
    int length = 0 ;
    
    for (int start =0 ;start<s.length(); start++){
   
        if(start > 0 ){
            return lengthoflongestsub(s);
        }

        for(int end = start+1; end<s.length(); end++){
            if(s.charAt(start) != s.charAt(end)){
                end++;
            }else{
                length = end - start;
                return length;
            }
        }
    }
    return 1;
    }
    
    static int lengthoflongestsub(String s){
        int length = 0;
        for (int start =0 ;start<s.length(); start++){
            for(int end = start+1; end<s.length(); end++){
                if(s.charAt(start) != s.charAt(end)){
                    end++;
                }else{
                    length = end - start;
                    
                }
            }
        }
        return length;   
    }


}