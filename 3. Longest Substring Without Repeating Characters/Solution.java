import java.util.Arrays;

/**
 * Created by Zhuang on 2018/4/5.
 */
// 3. Longest Substring Without Repeating Characters
// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
//
// 滑动窗口
// 其中使用last[c]保存字符c上一次出现的位置, 用于在右边界发现重复字符时, 快速移动左边界
// 使用这种方法, 时间复杂度依然为O(n), 但是只需要动r指针, 实际上对整个s只遍历了一次

// 时间复杂度: O(len(s))
// 空间复杂度: O(len(charset))
public class Solution {

    public int lengthOfLongestSubstring(String s){
        int[] last = new int[256];
        Arrays.fill(last,-1);

        int l = 0,r = -1;
        int res = 0;
        while(r + 1 < s.length()){
            r ++;
            if(last[s.charAt(r)] != -1)//判断字符是否出现过,将l快速移动到字符上一次出现的位置
                l = Math.max(l,last[s.charAt(r)] + 1);

            res = Math.max(res,r - l + 1);
            last[s.charAt(r)] = r;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println((new Solution()).lengthOfLongestSubstring( "abcabcbb" ));
        System.out.println((new Solution()).lengthOfLongestSubstring( "bbbbb" ));
        System.out.println((new Solution()).lengthOfLongestSubstring( "pwwkew" ));
        System.out.println((new Solution()).lengthOfLongestSubstring( "" ));
    }


}
