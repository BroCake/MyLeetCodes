
class q7 {

    class Solution {

        public int reverse(int x) {
            boolean isN = false;
            int tmp, rev = 0;

            if (x < 0) {
                isN = true;
                x = -x;
            }

            while (x > 0) {
                tmp = x % 10;
                try {
                    rev = Math.multiplyExact(rev, 10);
                    rev = Math.addExact(rev, tmp);
                } catch (ArithmeticException e) {
                    return 0;
                }
                x /= 10;
            }

            if (isN) {
                rev = -rev;
            }
            return rev;
        }
    }
}
