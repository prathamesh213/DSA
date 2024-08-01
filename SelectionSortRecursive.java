
import java.util.Arrays;

public class SelectionSortRecursive {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr, arr.length);
      
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[], int arrlength){
           
        if(arrlength <= 0){
            return;
        }
        
        
        int maxIndex = 0;
        for(int i = 0; i<=arrlength-1; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }


         int temp = arr[maxIndex];
         arr[maxIndex] = arr[arrlength-1];
         arr[arrlength-1] = temp;

         sort(arr, arrlength-1);
     }

    static void sort2(int[] arr, int r, int c, int max){

    } 
}
