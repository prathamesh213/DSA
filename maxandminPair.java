

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class maxandminPair {
    
    public static void main(String[] args) {
     int[] arr ={12,34,5,124,1,54,11,3};
     //System.out.println(Arrays.toString(getMinMax(arr)));
        
    }
     static Pair<Long, Long> getMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
       
        
       Long Min = (long) min;
       Long Max = (long) max;


        return new Pair(Min,Max) ;
    
    }
}
