import java.util.LinkedList;
import java.util.Queue;

public class Main{
    public static void main(String args[]) {
        Solution sol = new Solution();
        System.out.println(sol.reverse(-1234));
    }
}

class Solution {
    int ret = 0;
    Queue<Integer> every_bit = new LinkedList<Integer>();
    public int reverse(int x) {
        while(x != 0){
            int now = x % 10;
            x = x / 10;
            if(ret > Integer.MAX_VALUE / 10 || ret == Integer.MAX_VALUE && now > 7){
                return 0;
            }
            if(ret < Integer.MIN_VALUE / 10 || ret == Integer.MIN_VALUE && now < -8){
                return 0;
            }
            ret = ret * 10 + now;

        }
        return ret;
    }
}
