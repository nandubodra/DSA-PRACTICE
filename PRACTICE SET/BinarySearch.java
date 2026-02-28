public class BinarySearch {
    public static int BinarySearchNum(int arr[], int key) {
    int start =0;
    int end =arr.length-1;
    while(start <= end) {
        int mid = (start + end)/2;
        if (arr[mid]==0) {
            return mid;
        }
        else if(arr[mid]<key) {
            return mid+1;
        }
        else {
            return mid-1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,6,4,8,9,5,2,7};
        int key = 4;
        System.out.println(BinarySearchNum(arr, key));
    }
}
