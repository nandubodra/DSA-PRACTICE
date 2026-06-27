package PRACTICE01;

public class avg1 {
    // public static int average(int n) {
    //     int sum = 0;
    //     for(int i=1; i<n; i++) {
    //       sum += i;
            
    //     }
    //     return sum/n;
    // }
    public static int average(int a, int b, int c) {
        int sum =  a+b+c;
        
        return sum/3;
    }
    public static void main(String[] args) {
       System.out.println(average(3,4,5));
    }
}
