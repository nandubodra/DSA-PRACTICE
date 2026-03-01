public class SelectionSort {
    public static void PrintArr(int arr[]) {
        for(int k=0;k<arr.length;k++) {
            System.out.print(arr[k]+ " ");
        }
        System.out.println();
    }
    public static void Selection(int arr[]) {
        for(int i=0;i<arr.length-1;i++) {
            int minSort = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[minSort]>arr[j]) {
                     minSort =j;
                }
            }
            int temp = arr[minSort];
            arr[minSort]= arr[i];
            arr[i]=temp;
        } 
        
    }
    
    public static void main(String[] args) {
        int[] arr = {4,3,6,1,8,5,2,7};
        Selection(arr);
        PrintArr(arr);
    }
}
