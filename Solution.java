/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solu {
    public int romanToInt(String s) {
        int[] a = new int[100];
        a['I'] = 1;
        a['V'] = 5;
        a['X'] = 10;
        a['L'] = 50;
        a['C'] = 100;
        a['D'] = 500;
        a['M'] = 1000;
        int sum = 0;
        char perv = s.charAt(0);

        for(char c : s.toCharArray()){
            if(a[c] > a[perv]){
                //return a[c] - a[perv];
                sum = sum - 2 * a[perv];
            }
            sum = sum + a[c];
            //System.out.println(sum);
            perv = c;
        }
        return sum;
    }
    public static void main(String[] args) {
        Solu sol = new Solu();
        sol.romanToInt("LVIII");
    }
}
// @lc code=end

