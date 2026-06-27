package PRACTICE01 ;
import java.util.Scanner;
public class avg {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three inputs number A, B, C :");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int average = (A+B+C)/3;
        System.out.print("The average is :" + average);
    }
}


