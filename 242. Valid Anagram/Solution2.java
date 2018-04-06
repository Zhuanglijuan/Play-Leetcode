package valid_anagram;

/**
 * Created by Zhuang on 2018/4/6.
 */
//242. Valid Anagram
//https://leetcode-cn.com/problems/valid-anagram/description/
public class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arrs = new int['z' - 'a' + 1];
        for (char c : s.toCharArray()) {
            arrs[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            if (--arrs[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
