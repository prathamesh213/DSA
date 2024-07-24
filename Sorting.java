
// public class Sorting {
//     public static void main(String[] args) {
//         int arr[] = {3,23,2,33,44,556,65,7};
       
//          for(int i = 0; i<arr.length; i++){
//             boolean swapped = false;
//             for (int j = 0; j < arr.length - 1; j++) {
                             
//              if(arr[j+1]<arr[j]){
                  
//                int temp = arr[j+1];
//                arr[j+1]   = arr[j];
//                arr[j] = temp;
//                swapped =true;  
//             }

//             }
//       }
         
//       for (int i = 0; i < arr.length; i++) {
//           System.out.println(arr[i]);
//       }
    
    
//     }

// }


////////////SELECTION SORT////////////in acending order FIND MAXVAL ADN PUT IT AT THE LAST

// public class Sorting {
      
//     public static void main(String[] args) {
//         int arr[] = {5,4,3,2,1};
//          insertionSort(arr);
//          System.out.println(Arrays.toString(arr));   
     
// //[0, 3, 23, 23, 33, 44, 556, 556]
//     }
    
//     static void insertionSort(int[] arr){
       
//        for (int i = 0; i < arr.length; i++) {
//         int last = arr.length - i - 1 ;
//         int maxVal = maxVAl(arr, 0, last);
         
//         int temp = arr[last]; 
//          arr[last] = arr[maxVal];
//          arr[maxVal] = temp;
       
//        }
//     }

//     static int maxVAl(int[] arr, int start , int last){
//        int maxVal= start;
       
//        for (int i = 0; i <= last; i++) {
//            if(arr[i]>arr[maxVal]){
//             maxVal = i;
//            }
//        }
    
//        return maxVal;        
//     }
        
// }

//////////////////////////SELECTION SORT IN DECENDING ORDER/////////// FIND MAXVAL ADN PUT IT AT THE LAST
// public class Sorting {
      
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//          insertionSort(arr);
//          System.out.println(Arrays.toString(arr));   
     
// //[0, 3, 23, 23, 33, 44, 556, 556]
//     }
    
//     static void insertionSort(int[] arr){
       
//        for (int i = 0; i < arr.length; i++) {
//         int last = arr.length - i - 1 ;
//         int minVal = minVAl(arr, 0, last);
         
//         int temp = arr[last]; 
//          arr[last] = arr[minVal];
//          arr[minVal] = temp;
       
//        }
//     }

//     static int minVAl(int[] arr, int start , int last){
//        int minVal= start;
       
//        for (int i = 0; i <= last; i++) {
//            if(arr[i]<arr[minVal]){
//             minVal = i;
//            }
//        }
    
//        return minVal;        
//     }
        
// }

////////////////INSERTION SORT/////SORT FIRST TWO THEN ADD WITH 3RD THEN ADD 4TH TILL N-2 

/**
 * Sorting
//  */
// public class Sorting {

//     public static void main(String[] args) {
//         int arr[] = {3,5,67,43,32,31};
//         insertionSort(arr);
//         System.out.println(Arrays.toString(arr));   
//     }
//     static void insertionSort(int[] arr){

//         for (int i = 0; i < arr.length-1; i++) {
//             for(int j=i+1;j>0;j--){

//                 if(arr[j]<arr[j-1]){
//                     int temp = arr[j];
//                     arr[j]=arr[j-1];
//                     arr[j-1]=temp;
//                 }else{
//                     break;
//                 }

//             }
//         }
//     }
    
// }

/**
 *  CYCLIC SORT
 * Whenever there is in the quesion in rang of 0,N or whatever you knwo its cyclic sort.
 */
// public class Sorting {

//     public static void main(String[] args) {
     
//         int arr[] = {5,4,3,2,1};
//          cyclicSort(arr);
//          System.out.println(Arrays.toString(arr));  
//     }
    
//     static void cyclicSort(int[] arr){
//         int i = 0;

//         while (i<arr.length) { 
//             int correct = arr[i] - 1;
            
//             if(arr[i] != arr[correct]){
//                 swap(arr,i,correct);
//             }else{
//                 i++;
//             }
            
//         }


//     }
   
//     static void swap(int[] arr, int first , int second){
//          int temp = arr[first];
//          arr[first]=arr[second];
//          arr[second]=temp;       
//     }   
// }


// class Sorting{

//     public static void main(String[] args) {
//         int[] arr = {3,1,3,4,2};
//         System.out.println(findDuplicate(arr));
               
//     }
//     static  int findDuplicate(int[] nums) {
//         int ans = 0;  
//         int i = 0;
//         while (i<nums.length) { 
//             int correct = nums[i] - 1;
            
//             if(nums[i] != nums[correct]){
//                 swap(nums,i,correct);
//             }else{
//                 i++;
//             }
//         }
//     for(int j = 0 ; j<nums.length; j++){
      
//         if(nums[j] != j){
//            ans = nums[j];
//         }
        
//     }
        
//         return ans;
        
        
//     }
     
//      static void swap(int[] arr, int first , int second){
//          int temp = arr[first];
//          arr[first]=arr[second];
//          arr[second]=temp;       
//     } 


// }