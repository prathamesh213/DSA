
import java.util.ArrayList;

// RETURN AN ARRAYlIST IN RECURSIVE METHOD ITSELF
// SO THAT MULTIPLE SAME NUMS CAN BE STORED

public class LinearSearchRecursive {
     
    public static void main(String[] args) {
    int[] arr = {23,34,23,23,34,23,56,789,54,67};    
    int target = 23;
    ArrayList<Integer> list = new ArrayList<>();
    // new ArrayList passet thus making ArrayList<Interger> list = new ArraylList<>()
    System.out.println(numsofTarget(arr, target, 0, list));
    
    //2.
    System.out.println(numsofTarget2(arr, target, 0));

    //3,
   System.out.println( numsofTarget3(arr, target, 0));
    
    }

    //ArrayList reference variable created in the parameters and passed in the function and created with new keyword in main fn.
    //Method 1.
    static ArrayList<Integer> numsofTarget(int[] arr,int target,int i, ArrayList<Integer> list){
    if(i == arr.length){
        return list;
    }
    if(arr[i] == target){
        list.add(i);
    }
    return numsofTarget(arr, target, i+1,list);
}

//Method 2.
//This is intializing the list out side the recursive call
static ArrayList<Integer> list2 = new ArrayList<>();
static ArrayList<Integer> numsofTarget2(int[] arr,int target,int i){
    if(i == arr.length){
        return list2;
    }
    if(arr[i] == target){
        list2.add(i);
    }
    return numsofTarget2(arr, target, i+1);
}

//Method 3 Pure Recursion not ideal complexity but can be used
//Creating a ArrayList<> in every recursive call.

static ArrayList<Integer> numsofTarget3(int[] arr,int target,int i){
    
     ArrayList<Integer> list3 = new ArrayList<>();

    if(i == arr.length){
        return list3;
    }
    if(arr[i] == target){
        list3.add(i);
    }
    ArrayList<Integer> newAns =  numsofTarget3(arr, target, i+1);

    list3.addAll(newAns);
    
    return list3;
}

}
