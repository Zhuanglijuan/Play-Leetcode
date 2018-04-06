package valid_anagram;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Zhuang on 2018/4/6.
 */
 //242. Valid Anagram
 //https://leetcode-cn.com/problems/valid-anagram/description/
public class Solution1 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        for(int i = 0; i < sc.length ; i ++)
            if(sc[i] != tc[i])
                return false;
        return true;

    }
}
