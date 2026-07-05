package PRACTICE01;

public class sqrt {
    public static void main(String[] args) {
         float n = 49;
        for(int i=1; i<n; i++) {
            if(n/i == i) {
                System.out.println("The square root of " + n + " is : " + i);
            } 
        }
    }
}
