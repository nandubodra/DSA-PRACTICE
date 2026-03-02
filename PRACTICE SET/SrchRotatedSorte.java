public class SrchRotatedSorte {
    public static int SearchRotatedArray(int arr[], int key ,int start,int end) {
        if(start>end) {
            return -1;
        }
           int mid = ( start + end )/2;
         if(arr[mid]==key) {
            return mid;
           }
           if(arr[start]<= arr[mid])  {
            if(key >= arr[start] && key <= arr[mid]) {
                return SearchRotatedArray(arr, key, start, mid-1);
            }
            else {
                return SearchRotatedArray(arr, key, mid+1, end);
            }
           }
           else {
            if(arr[mid] <= key && key <= arr[end]) {
                return SearchRotatedArray(arr, key,mid+1, end);
            }
            else {
                return SearchRotatedArray(arr,key,start, mid-1);
            }
           }
    
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int key = 6;
        int result = SearchRotatedArray(arr, key, 0, arr.length - 1);
        System.out.println("Index of " + key + " is: " + result);
    }
}



