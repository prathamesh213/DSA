public class RotateSearchRecursive {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3,4};
       System.out.println( rotateSearch(arr, 1, 0, arr.length-1));
    }
    
static int rotateSearch(int[] arr, int target, int s ,int e){

if(s>e){
    return -1;
}    

int m = s + (e-s)/2;

if(arr[m] == target){
    return m;
}
if(arr[s] <= arr[m]){
    if(target>=arr[m] && target<=arr[arr.length]){
        return rotateSearch(arr, target, m+1, e);
    }
}


if(target>arr[0] && target<arr[m]){
    return rotateSearch(arr, target, s, m-1);
}
 return -1;
}
}