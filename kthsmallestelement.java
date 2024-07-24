public class kthsmallestelement {
public static void main(String[] args) {
int k = 3;
int[] arr = {2,23,56,72,1245,67,23,1,2,4};    
System.out.println(kthelement(arr, k));
} 

static int kthelement(int[] arr, int k){
    for(int i=0; i<arr.length-1; i++){
        for(int j=0 ; j<arr.length-1;j++)
        if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] =temp;
        }
    }

    return arr[k-1];        
} 

}


