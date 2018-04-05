import java.util.Arrays;

/**
 * Created by Zhuang on 2018/4/5.
 */
// 350. Intersection of Two Arrays II
// https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
public class Solution2 {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] save = new int[nums1.length < nums2.length ? nums1.length : nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                save[k] = nums1[i];
                i++;
                j++;
                k++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
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
        int[] res = (new Solution2()).intersect(nums1, nums2);
        printArr(res);
    }
}
