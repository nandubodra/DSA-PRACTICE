package PRACTICE01;

public class pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n; i>=0; i--) {
            System.out.println();
            for(int j=i-1; j>=0; j--) {
                System.out.print(" ");
                System.out.print(i-j);
            }
        }
    }
}
