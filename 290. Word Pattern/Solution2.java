package wordpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhuang on 2018/4/6.
 */
//290. Word Pattern
    //https://leetcode-cn.com/problems/word-pattern/description/
public class Solution2 {
    public boolean wordPattern(String pattern, String str) {
        //判断字符串不为空
        if (pattern == null || str == null)
            return false;
        String[] words = str.split(" ");
        //判断字符串长度
        if (words.length != pattern.length())
            return false;

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {

            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(words[i]))
                    return false;
                map.put(pattern.charAt(i), words[i]);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat do";
        System.out.print(new Solution2().wordPattern(pattern, str));
    }
}
