


public class SortedArrayORnot {
 
    public static void main(String[] args) {
        int[] arr = {8,78,5634,23423,2};
       int ans =  sorted(arr, 0);
       if(ans == 0){
        System.out.println(false);
       }else{System.out.println(true);}

      System.out.println( sortedClean(arr, 0));
    }
    
   //Clean Solution
   static boolean  sortedClean(int[] arr, int i){
    if(i==arr.length-1){
        return true;
      }
    return arr[i]<arr[i+1] && sortedClean(arr, i+1);
   }

    // My Solution
    static int sorted(int[] arr, int i){
      
      if(i==arr.length-1){
        return 1;
      }
      if(arr[i]<arr[i+1]){
       return sorted(arr, i+1);
    
    }
    return 0;
   }
    
}