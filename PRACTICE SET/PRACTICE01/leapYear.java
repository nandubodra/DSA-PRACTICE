package PRACTICE01;
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year to check leap or not :");
        int year = sc.nextInt();
        if((year%4==0 && year%100 !=0) || year%400==0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year+ " is not a Leap year");
        }
    }
}
