package Number_of_Bommerangs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Zhuang on 2018/4/13.
 */
//447. 回旋镖的数量
//https://leetcode-cn.com/problems/number-of-boomerangs/description/
//时间复杂度O(n^2)
//空间复杂度O(n)
public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        //初始结果为0
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            HashMap<Integer, Integer> record = new HashMap<>();//存储不同距离出现频次
            for (int j = 0; j < points.length; j++) {
                if (j != i)
                    if (!record.containsKey(distance(points[i], points[j])))
                        record.put(distance(points[i], points[j]), 1);
                    else
                        record.put(distance(points[i], points[j]), record.get(distance(points[i], points[j])) + 1);
            }

            Iterator it = record.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if ((int) entry.getValue() >= 2)
                    res += ((int) entry.getValue()) * ((int) entry.getValue() - 1);
            }
        }
        return res;
    }

    //求两点距离平台
    private int distance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return dx * dx + dy * dy; //可能存在整型溢出
    }
}
