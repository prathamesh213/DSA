public class BinarySearchusingRecurrsion {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,55,66,234};
        int target = 234;
        System.out.println(bsearch(arr, target, 0, arr.length-1));
    }

    static int  bsearch(int[] arr, int target, int s, int e){
        
       int m = s + (e-s)/2;

       if(s>e){
        return -1;
       }
       if(arr[m] == target){
        return m;
       }
       if(target > arr[m]){
         return bsearch(arr, target, m+1, e);
       }

    return bsearch(arr, target, s, m-1);
    }
}
