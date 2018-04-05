
import java.util.Arrays;

/**
 * Created by Zhuang on 2018/4/5.
 */
// 75. Sort Colors
// https://leetcode.com/problems/sort-colors/description/
public class Solution1 {
    public void sortColors(int[] nums){
        int [] copyNums = Arrays.copyOf(nums,nums.length);
        int[] count = {0, 0, 0};// 存放0, 1, 2三个元素的频率
        for(int i = 0 ; i < nums.length ; i ++){
            assert nums[i] >= 0 && nums[i] <= 2;
            count[nums[i]] ++;
        }

        for(int i = 1; i < count.length; i ++){
            count[i] += count[i - 1];
        }

        for(int i = nums.length - 1; i > -1; i --){
            nums[count[copyNums[i]] - 1] = copyNums[i];
            count[copyNums[i]] --;
        }
    }

    public static void printArr(int[] nums){
        for(int num: nums)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums = {2, 1, 2, 1, 1, 0};
        (new Solution1()).sortColors(nums);
        printArr(nums);
    }
}
