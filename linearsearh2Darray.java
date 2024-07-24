/**
 * ///////////////////////max and minIN2D Array////////////////////////////////////
 * linearsearh2Darray
 */
// public class linearsearh2Darray {

//     public static void main(String[] args) {
     
//         int[][] arr= {
              
//             {12,23,56,2367,433},
//             {2,45,87,7,23,67},
//             {73,3,157,45,},


//         };       
//         int target = 2333; 
//         System.out.println(search(arr, target));
//         System.out.println(maxVAl(arr));
//     }
//     static int minVAl(int[][] arr){
//         int min = arr[0][0];  
//          for(int i = 0; i < arr.length; i++) {
//              for (int j = 0; j < arr[i].length; j++) {
                 
//                  if(arr[i][j]<min){
//                      min = arr[i][j];
                         
//                  }
                 
//              }
//              return min;
//          }
//       return -1;
//      }

//     static int maxVAl(int[][] arr){
//        int max = 0;  
//         for(int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
                
//                 if(arr[i][j]>max){
//                     max = arr[i][j];
                        
//                 }
                
//             }
//             return max;
//         }
//      return -1;
//     }

//     static int search(int[][] arr, int target){
         
//         for(int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
                
//                 if(arr[i][j] == target){
//                     System.out.println(i);
//                     System.out.println(j);

//                     return arr[i][j];
                    
//                 }
                
//             }
//         }
//      return 1;
//     }
// }
