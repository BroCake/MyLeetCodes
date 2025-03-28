
class q9 {

    class Solution {

        public boolean isPalindrome(int x) {
            boolean ans = false;
            int tmp, norm = x, rev = 0;

            while (x > 0) {
                tmp = x % 10;
                rev = rev * 10 + tmp;
                x /= 10;
            }

            if (norm == rev) {
                ans = true;
            }
            return ans;
        }
    }
}
