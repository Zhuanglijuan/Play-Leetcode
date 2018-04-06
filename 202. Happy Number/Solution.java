package happynumber;

/**
 * Created by Zhuang on 2018/4/6.
 */
//202. Happy Number
//https://leetcode-cn.com/problems/happy-number/description/
public class Solution {

    public boolean isHappy(int n) {
        if (n == 1)
            return true;
        if (n < 0)
            return false;

        while (n != 1) {
            n = sum(n);
            if (n == 4) //所有不快乐数的数位平方和计算，最後都会进入 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 的循环中。
                return false;
        }

        return true;
    }

    private int sum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        int n = 19;
        if(new Solution().isHappy(n))
            System.out.println(n + " is a happy number");
        else
            System.out.println(n + " is not a happy number");

    }
}
