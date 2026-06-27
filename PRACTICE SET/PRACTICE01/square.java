package PRACTICE01;

public class square {
    public static double area(int n) {
        // return n*n;
        return Math.pow(n,2);
    }
    public static void main(String[] args) {
        System.out.println("Area of Square is :"+ area(5));
    }
}
