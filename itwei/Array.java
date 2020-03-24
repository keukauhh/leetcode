/**
 * 189. 旋转数组
 */
public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        rotate(arr,3);
    }

    public static void rotate(int[] nums, int k) {
        int temp = 0;
        while (k > 0){
            for (int x = nums.length-1; x > 0; x--){
                temp = nums[x];
                nums[x] = nums[x-1];
                nums[x-1] = temp;
            }
            k--;
        }
    }
}
