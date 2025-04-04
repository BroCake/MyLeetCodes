
class q13 {

    class Solution {

        public int romanToInt(String s) {
            int ans = 0, ip, ic;    //answer to return
            char p = '#';   //previous character

            char[] charArr = s.toCharArray();
            for (char c : charArr) {
                ip = getVal(p);
                ic = getVal(c);
                if (doSub(ip, ic)) {
                    ans -= 2 * ip;
                    ans += ic;
                } else {
                    ans += ic;
                }
                p = c;

            }
            return ans;
        }

        public int getVal(char k) {          //get value of character
            switch (k) {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    return 0;
            }

        }

        public boolean doSub(int p, int c) {   //check if previous requires subtraction
            int i = c - p;
            switch (i) {
                case 4:
                    return true;
                case 9:
                    return true;
                case 40:
                    return true;
                case 90:
                    return true;
                case 400:
                    return true;
                case 900:
                    return true;
                default:
                    return false;
            }
        }
    }
}
