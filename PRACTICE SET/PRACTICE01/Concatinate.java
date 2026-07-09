package PRACTICE01;

public class Concatinate { 
    public static long AddOrMultiply(int n){
        int sum = 0;
        int concat = 0;
        while(n>0){
           int digit = n%10;
           if( digit != 0) {
             concat = concat * 10 + digit;
             sum += digit;
           n /= 10;
           }
        }
        return sum*concat;
    }
    public static void main(String[] args) {
        int n = 102034;
       System.out.println( AddOrMultiply(n));
    }   
}