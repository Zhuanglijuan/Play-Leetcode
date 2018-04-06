package wordpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhuang on 2018/4/6.
 */
//290. Word Pattern
//https://leetcode-cn.com/problems/word-pattern/description/
public class Solution1 {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i = 0; i < words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.print(new Solution1().wordPattern(pattern, str));
    }
}
