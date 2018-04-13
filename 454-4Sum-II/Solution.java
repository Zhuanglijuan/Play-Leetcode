package fournum_2;

import java.util.HashMap;

/**
 * Created by Zhuang on 2018/4/13.
 */
//454. 4 num II
//https://leetcode-cn.com/problems/4sum-ii/description/
//时间复杂度:O(n^2)
//空间复杂度:O(n^2)
public class Solution {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        assert A.length == B.length && B.length == C.length && C.length == D.length;
        HashMap<Integer, Integer> record = new HashMap<>();

        for (int i = 0; i < C.length; i++)
            for (int j = 0; j < D.length; j++) {
                if (!record.containsKey(C[i] + D[j]))
                    record.put(C[i] + D[j], 1);
                else
                    record.put(C[i] + D[j], record.get(C[i] + D[j]) + 1);
            }

        int res = 0;
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B.length; j++)
                if (record.containsKey(0 - A[i] - B[j]))
                    res += record.get(0 - A[i] - B[j]);

        return res;
    }
}
