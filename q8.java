
class q8 {

    class Solution {

        public int myAtoi(String s) {
            char[] a = s.toCharArray();
            int ans = 0, l = a.length, i, tmp;
            boolean nSign = false;
            for (i = 0; i < l && a[i] == ' '; i++) {
            }
            if (i >= l) {
                return 0;
            }
            if (a[i] == '-' || a[i] == '+') {
                if (a[i] == '-') {
                    nSign = true;
                }
                i++;
            }

            for (; i < l && a[i] <= '9' && a[i] >= '0'; i++) {
                tmp = a[i] - '0';
                try {
                    ans = Math.multiplyExact(ans, 10);
                    ans = Math.addExact(ans, tmp);
                } catch (ArithmeticException e) {
                    if (nSign) {
                        return Integer.MIN_VALUE;
                    }
                    return Integer.MAX_VALUE;
                }
            }

            if (nSign) {
                ans = -ans;
            }
            return ans;
        }
    }
}
