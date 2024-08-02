
import java.util.Arrays;

 public class QuickSortRecursive {
    public static void main(String[] args) {
    int[] arr = {5,4,3,2,1};
    quickSort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
}

static void quickSort(int[] arr, int low , int hi){
    
 int s = low;
 int e = hi;   
 if (low>=hi) {
       return;
 }
    
  int mid = s + (e-s)/2;
  int pvt = arr[mid];
   while (s<=e) {
          while (arr[s]<pvt) {     
            s++;
          }
          while (arr[e]>pvt) {
            e--;
          }
        
          if  (s<=e){
              int temp = arr[s];
              arr[s] = arr[e];
              arr[e] = temp;
              s++;
              e--;
            }
   }

 quickSort(arr, low, e);
 quickSort(arr, s, hi);
}


}
