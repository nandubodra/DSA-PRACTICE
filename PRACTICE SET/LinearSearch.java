public class LinearSearch {
    public static void LinearSearchNum(int arr[], int key) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==key) {
                System.out.println(i);
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[]= {1,3,5,6,4,7,9,2};
        int key = 6;
        System.out.print("The index of "+ key +" is : " );
        LinearSearchNum(arr, key);
        
    }

}
