
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhuang on 2018/4/7.
 */
// Source : https://leetcode.com/problems/two-sum/description/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> record = new HashMap<Integer, Integer>();

        for(int i = 0 ; i < nums.length; i ++){
            int complement = target - nums[i];
            if(record.containsKey(complement)){
                int[] res = {i,record.get(complement)};
                return res;
            }

            record.put(nums[i],i);
        }

        throw new IllegalStateException("the input has no solution");
    }
}
