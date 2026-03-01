public class InsertionSort {
    public static void PrintArr(int arr[]) {
    for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
public static void Insertion(int arr[] ) {
    for(int j=1;j<arr.length;j++) {
        int curr = arr[j];
        int prev = j-1;
        while (prev >= 0 && arr[prev] > curr) {
            arr[prev+1] = arr[prev];
            prev--;
        }
        arr[prev+1]= curr;
    }
}
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,5};
        Insertion(arr);
        PrintArr(arr);

    }
}
