/**
 * Created by Zhuang on 2018/4/5.
 */

// 283. Move Zeroes
// https://leetcode.com/problems/move-zeroes/description/
//
// 原地(in place)解决该问题
// 时间复杂度: O(n)
// 空间复杂度: O(1)
public class Solution {
    public void moveZeroes(int[] nums){
        int k = 0;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] != 0){
                if(k != i)
                    swap(nums,k++,i);
                else
                    k++;
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String args[]){

        int[] arr = {0, 1, 0, 3, 12};

        (new Solution()).moveZeroes(arr);

        for(int i = 0 ; i < arr.length ; i ++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
