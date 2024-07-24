// public class binarySearchAlgo{

//   // Method to perform binary search
//   public static int binarySearch(int[] array, int target) {
//       int left = 0;
//       int right = array.length - 1;

//       while (left <= right) {
//           int mid = left + (right - left) / 2;

//           // Check if target is present at mid
//           if (array[mid] == target) {
//               return mid;
//           }

//           // If target is greater, ignore left half
//           if (array[mid] < target) {
//               left = mid + 1;
//           } else {
//               // If target is smaller, ignore right half
//               right = mid - 1;
//           }
//       }

//       // Target is not present in array
//       return -1;
//   }

//   public static void main(String[] args) {
//       int[] array = {2, 3, 4, 10, 40};
//       int target = 2;
//       int result = binarySearch(array, target);

//       if (result == -1) {
//           System.out.println("Element not present in array");
//       } else {
//           System.out.println("Element found at index " + result);
//       }
//   }
// }

/**
 * binarySearchAlgo
 */
// peak of a mountian arr

/**
 * binarySearchAlgo
 */
// public class binarySearchAlgo {
  
//   public static void main(String[] args) {
     
//     int[] arr = {1,2,3,4,5,7,3,1};
//     int a = peakVal(arr);
//     System.out.println(a);

//   }

//   static int peakVal(int[] Arr){
     
//     int start = 0;
//         int end  = Arr.length - 1;

//         while(start <= end ){
             
//              int mid = start + (end - start)/2;

//             if(Arr[mid] > Arr[mid + 1] && Arr[mid] > Arr[mid - 1]){return mid;}

//             if(Arr[mid] > Arr[mid + 1]){
//                 end = mid;
//             }else{
//                 start = mid + 1;
//             }
//         } 
//      return -1;



//   }
  
// }
/**
 *       Q. Ceailing of a number binarySearchAlgo
 *       Q. Floor of a number 
 */
// public class binarySearchAlgo {

//         public static void main(String[] args) {
         
//           int arr[] = {1,3,4}; // 3 and 6
//           int a = cealing(arr, 2); 
//           System.out.println("ans = " + a);
//         }

       
        
//         static int cealing(int[] arr , int target){
//                    int start = 0;
//                    int end = arr.length - 1;

//            while (start <= end) { 
//             int mid = start + (end - start)/2; 
           
            
            
//             if(target < arr[mid])
//             {end = mid-1;}
//             else if(target > arr[mid]){
//                start = mid+1;          
//              }

           
                  
//           }        
          
//           return  end;
//         }

// }
