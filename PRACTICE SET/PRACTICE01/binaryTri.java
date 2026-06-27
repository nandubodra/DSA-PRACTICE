package PRACTICE01;

public class binaryTri {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++) {
             String x = Integer.toBinaryString(i);
            System.out.println(x);
        }
        System.out.print(" ");
    }
}
