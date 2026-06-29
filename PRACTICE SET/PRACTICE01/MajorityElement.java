package PRACTICE01;

public class MajorityElement {
    public static int majority(int[] nums) {
        int majorityCount = nums.length/2;
        for(int i=0; i<nums.length; i++) {
            int count = 0;
            for (int j=0; j<nums.length; j++) {
                if( nums[j] == nums[i]) {
                   count += 1;
                }
            }
            if(count > majorityCount) {
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("The Majority Element is : " + majority(nums));
    }
}
