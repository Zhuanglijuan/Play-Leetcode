package ContainsDuplicateII;

import java.util.HashSet;

/**
 * Created by Zhuang on 2018/4/13.
 */
//219-Contains-Duplicate-II
//https://leetcode-cn.com/problems/contains-duplicate-ii/description/
//时间复杂度O(n)
//空间复杂度O(k)
public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> record = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (record.contains(nums[i]))
                return true;
            record.add(nums[i]);
            //保持record中最多有k个元素
            if (record.size() == k + 1)
                record.remove(nums[i - k]);

        }
        return false;
    }
}
