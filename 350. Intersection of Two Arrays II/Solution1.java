import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Zhuang on 2018/4/5.
 */
// 350. Intersection of Two Arrays II
// https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
public class Solution1 {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> record = new HashMap<Integer, Integer>();
        int[] save = new int[nums1.length < nums2.length ? nums1.length : nums2.length];
        for (int num : nums1)
            if (!record.containsKey(num))
                record.put(num, 1);
            else
                record.put(num, record.get(num) + 1);


        int k = 0;
        for (int num : nums2)
            if (record.containsKey(num) && record.get(num) > 0) {
                save[k++] = num;
                record.put(num, record.get(num) - 1);
            }

        return Arrays.copyOfRange(save, 0, k);
    }

    private static void printArr(int[] arr) {
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2};
        int[] res = (new Solution1()).intersect(nums1, nums2);
        printArr(res);
    }
}
