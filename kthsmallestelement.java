public class kthsmallestelement {
public static void main(String[] args) {
int k = 3;
int[] arr = {7,10,4,3,20,15};    
System.out.println(kthelement(arr, k));
} 

static int kthelement(int[] arr, int k){
    for(int i=0; i<k+1; i++){
        for(int j=0 ; j<k+1;j++)
        if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] =temp;
        }
    }

    return arr[k-1];        
} 

}


