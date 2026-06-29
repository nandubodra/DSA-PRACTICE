package PRACTICE01;

public class distinct {
    public static boolean atLeastTwice(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] == arr[arr.length-1]) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(atLeastTwice(arr));
    }
}
