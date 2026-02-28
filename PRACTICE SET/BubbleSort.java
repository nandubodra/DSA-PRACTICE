public class BubbleSort {
    public static void BubboleSort(int arr[]) {
     for(int i=0;i<arr.length;i++) {
        for(int j=0;j<arr.length-1-i;j++) {
            if(arr[j]>arr[j+1]) {
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
     }
    }
    public static void PrintArr(int arr[] ) {
        for(int k=0;k<arr.length-1;k++) {
        System.out.print(arr[k]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int arr[] = {1,5,3,6,7,8,4,2,9};
        BubboleSort(arr);
        PrintArr(arr);

    }
}