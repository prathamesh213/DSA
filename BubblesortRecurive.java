 
import java.util.Arrays;



public class BubblesortRecurive {
    public static void main(String[] args) {
     
        int arr[] = {4,3,2};
        sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
     
   static void sort(int[] arr, int r, int c ){
    
    if(r==0){
        return;
    }
  
     if(c<r){
         if(arr[c]>arr[c+1]){
           int temp = arr[c];
           arr[c] = arr[c+1];
           arr[c+1] = temp;
    }
       sort(arr, r, c+1);
    }else{
       sort(arr, r-1, 0);
      }
 
    }

    public static void sort2(int[] arr, int r, int c) {
        // Base case: If the array is fully sorted
        if (r == 0) {
            return;
        }

        // Recursive case: If c is less than r, we compare and possibly swap elements
        if (c < r) {
            // Compare and swap if needed
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            // Move to the next element
            sort2(arr, r, c + 1);
        } else {
            // Once we reach the end of the array for the current r, we reduce r and reset c
            sort2(arr, r - 1, 0);
        }
    }
}
