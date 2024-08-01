
import java.util.Arrays;
public class MergeSortRecursive {

        public static void main(String[] args) { 

            int[] arr = {34,4565,32,23,4,56,568,32,589};
             mergeSortInplace(arr, 0, arr.length);
             System.out.println(Arrays.toString(arr));
        }

        public static int[] mergeSort(int[] arr) {
            if(arr.length <=1){
                 return arr;
            }
            
            int mid = arr.length/2;

            int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
            int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

            return merge(left, right);
             
        }

        public static int[] merge(int[] left, int[] right) {
            
               int[] mix = new int[left.length + right.length];

               int i = 0;
               int j = 0;
               int k = 0;
             
               while (i<left.length && j<right.length) {

                if(left[i] < right[j]){
                    mix[k] = left[i];
                    i++;
                    k++;
                }else{
                    mix[k] = right[j];
                    j++;
                    k++;
                }

            }


                    while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
               return mix;
        }

        public static void mergeSortInplace(int[] arr, int s , int e) {
            if( e-s == 1){
                 return;
            }
            
            int mid = s + (e-s)/2;

             mergeSortInplace(arr, s, mid);
             mergeSortInplace(arr, mid, arr.length);

            merge(arr, s , mid ,e );
             
        }

        public static void merge(int[] arr, int s, int mid , int e) {
            
               int[] mix = new int[e-s];

               int i = s;
               int j = mid;
               int k = 0;
             
               while (i<mid && j<e) {

                if(arr[i] < arr[j]){
                    mix[k] = arr[i];
                    i++;
                    k++;
                }else{
                    mix[k] = arr[j];
                    j++;
                    k++;
                }

            }


            while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
       
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }

}









}