package PRACTICE01;
import java.util.Scanner;
public class weekName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a week number(1-7) :");
        int num = sc.nextInt();
        switch (num) {
            case 1:System.out.println("Monday");
                break;
            case 2:System.out.println("Tuesday");
                 break;
            case 3:System.out.println("Wednusday");
                break;
            case 4:System.out.println("Thursday");
                break;
            case 5:System.out.println("Friday");
                break;
            case 6:System.out.println("Saturday");
                break;
            case 7:System.out.println("Sunday");
            default:
                System.out.println("Invalid Input ! Please enter week number between (1 - 7) ");
                break;
        }
    }
}
