package PRACTICE01;

public class inversionsCount {
    public static int getInvCount(int arr[]) {
        int n = arr.length;
        int invCount = 0;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] > arr[j]) {
                    invCount++;
                }
            }
        }
        return invCount;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        //int arr[] = {5,5,5,5};
        System.out.println("The inversion Count is : "+getInvCount(arr));
    }
    
}
