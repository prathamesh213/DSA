

public class patternstarRecursion {
    public static void main(String[] args){
        int n = 6;
        invertedTriangl(n);
        straightTriangle(0, n);
        rcTriangleInverted(n, 0);
        rctriangleStraight(1, n+1);
    }

    static void invertedTriangl(int n){
        if (n==0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*"); 
        }
        System.out.println();
        invertedTriangl(n-1);
    }

     //Method 1
    static void straightTriangle(int s ,int n){
        if (s==n) {
            return;
        }
        for (int i = 0; i < s; i++) {
            System.out.print("*"); 
        }
        System.out.println();
        straightTriangle(s+1, n);
    }

    //Method 2
    static void rcTriangleInverted(int r , int c){
     if(r==0){
        return;
     }
      if(c < r){
            System.out.print("*");
            rcTriangleInverted(r, c+1);
      }else{
        System.out.println();
        rcTriangleInverted(r-1, 0);
      } 

    }

    static void rctriangleStraight(int r, int n){
       if(n==0){
        return;
       }
      if(r<n){
        System.out.println("*");
        straightTriangle(r+1, n);
      }
      else{
        straightTriangle(0, n-1);
      }
    }
} 
