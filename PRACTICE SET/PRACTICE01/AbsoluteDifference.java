package PRACTICE01;

import java.util.Arrays;

public class AbsoluteDifference {
    public static void main(String[] args) {
        int Arr1[] = {1,2,3};
        int Arr2[] = {2,1,3};

        Arrays.sort(Arr1);
        Arrays.sort(Arr2);

        int minDiff = 0;
        for(int i=0; i<Arr1.length; i++) {
            minDiff += Math.abs(Arr1[i] - Arr2[i]);

        }
        System.out.println("Minimum Absolute Difference of Pair : " + minDiff);
    }
}
