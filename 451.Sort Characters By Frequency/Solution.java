package Sort_Characters_By_Frequency;

import java.util.Arrays;

/**
 * Created by Zhuang on 2018/4/6.
 */
//451. 根据字符出现频率排序
//https://leetcode-cn.com/problems/sort-characters-by-frequency/description/
public class Solution {
    public String frequencySort(String s) {

        int[] count = new int[95];
        Arrays.fill(count, 0);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 32]++;
        }

        int[] arr = Arrays.copyOfRange(count, 0, 95);
        Arrays.sort(arr);
        StringBuffer res = new StringBuffer();

        for (int i = 94; i >= 0; i--) {
            if (arr[i] == 0)
                break;
            for (int j = 0; j < 95; j++) {
                if (count[j] != 0 && count[j] == arr[i]) {
                    int n = arr[i];
                    while (n > 0) {
                        res.append((char) (j + 32));
                        n--;
                        count[j] --;
                    }
                }
            }

        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abcc";
        System.out.print(new Solution().frequencySort(s));
    }
}
