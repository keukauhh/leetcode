public class RemoveDuplicates {
/**
    26.删除排序数组中的重复项


 */
    public static void main(String[] args) {
        int[] params = new int[]{0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(params);
    }

    //[0,0,1,1,1,2,2,3,3,4]

    /**
     * 思路
     * 快慢指针
     * count作为慢指针  循环里的x作为快指针
     * 快慢做对比，遇到不同的快的赋值给慢的
     * @param nums
     * @return
     */
    private static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int count = 0;
        for(int x=1; x<nums.length; x++){
            if(nums[x] != nums[count]){
                nums[++count] = nums[x];
            }
        }
        return count+1;
    }
}
