package PRACTICE01;

public class water {
    public static int trappingWater(int[] height) {
        int res = 0;
        int first = 0;
        int last = height.length-1;
        int fstMax = height[first];
        int lstMax = height[last];
        while(first < last) {
            if(fstMax < lstMax) {
                first++;
                fstMax= Math.max(fstMax, height[first]);
                res += fstMax - height[first];
            }
            else {
                last--;
                lstMax = Math.max(lstMax, height[last]);
                res += lstMax - height[last];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The unit of Rain trapped are :" +trappingWater(height));
    }
}
