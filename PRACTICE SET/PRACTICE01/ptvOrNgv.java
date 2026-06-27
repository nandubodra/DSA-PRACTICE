package PRACTICE01;
import java.util.Scanner;
public class ptvOrNgv {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a no. to check Positive Or Negative :");
    int x = sc.nextInt();
    if(x > 0) {
        System.out.print(x+" "+ "is the Positive number");
    }
    else {
        System.out.print(x+ " " +"is the negative number");
    }
    }
}