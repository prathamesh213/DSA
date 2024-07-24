
public class Oddeven {
    public static void main(String[] args) {
        int q = 321;
        System.out.println(Isodd(q));
        
    }
    static boolean Isodd(int q){
        return (q & 1) == 1;
    }
    // so we are doing AND operation with 1 so this is multiply thus 1.1 = 1; 0.1 = 0; hence 

}
