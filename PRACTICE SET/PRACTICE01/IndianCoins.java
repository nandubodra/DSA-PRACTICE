package PRACTICE01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,1000};
         int Amount = 591;
        Arrays.sort(coins, Comparator.reverseOrder());
        ArrayList<Integer> arr = new ArrayList<>();
        int CountOfCoins = 0;
        for(int i=0; i<coins.length; i++) {
            if(coins[i] <= Amount) {
               while (coins[i] <= Amount) {
                   CountOfCoins++;
                   arr.add(coins[i]);
                   Amount -= coins[i];
               }
            }
        }
        System.out.println("The Amount of total (minimum) Coin used = " + CountOfCoins);
        for(int i=0; i<arr.size(); i++) {
            System.out.print(arr.get(i)+ " ");
        }
        System.out.println();
    }
}
