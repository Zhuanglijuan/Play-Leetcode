import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhuang on 2018/4/5.
 */
// 349. Intersection of Two Arrays
// https://leetcode.com/problems/intersection-of-two-arrays/description/
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> record = new HashSet<Integer>();
        for(int num : nums1){
            record.add(num);
        }

        Set<Integer> resultSet = new HashSet<Integer>();
        for(int num : nums2){
            if(record.contains(num))
                resultSet.add(num);
        }

        int[] res = new int[resultSet.size()];
        int index = 0;
        for(int num : resultSet){
            res[index ++]=num;
        }

        return res;
    }
}
