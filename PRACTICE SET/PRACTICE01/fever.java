package PRACTICE01;
import java.util.Scanner;
public class fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a degree of body temperature :");
        float temp = sc.nextInt();
        if(temp >= 100) {
            System.out.println("You have a fever ");
        } else {
            System.out.println("you don't have a fever ");
        }
    }
}
