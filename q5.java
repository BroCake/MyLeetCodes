


class q5 {

    class Solution {

        public String longestPalindrome(String s) {
            String ans, os = oddPal(s), es = evenPal(s);

            if (es.length() > os.length()) {
                ans = es;
            } else {
                ans = os;
            }

            return ans;

        }

        public String oddPal(String s) {
            int l = s.length();
            int c, f, e, bf = 0, be = 0, cl = 1, hl = 1;
            for (int i = 0; i < l; i++) {
                for (c = 1; i + c < l && i - c >= 0; c++) {
                    f = s.charAt(i - c);
                    e = s.charAt(i + c);
                    if (f != e) {
                        break;
                    }
                    cl += 2;

                } //end for
                c--;
                if (cl > hl) {
                    hl = cl;
                    bf = i - c;
                    be = i + c;
                }
                cl = 1;
            }// end for outer
            return s.substring(bf, be + 1);
        }

        public String evenPal(String s) {
            int l = s.length();
            int c, f, e, bf = 0, be = 0, cl = 0, hl = 0;
            for (int i = 0; i < l; i++) {
                for (c = 0; i + c + 1 < l && i - c >= 0; c++) {
                    f = s.charAt(i - c);
                    e = s.charAt(i + c + 1);
                    if (f != e) {
                        break;
                    }
                    cl += 2;
                } //end for
                c--;
                if (cl > hl) {
                    hl = cl;
                    bf = i - c;
                    be = i + c + 1;
                }
                cl = 0;
            }// end for outer
            return s.substring(bf, be + 1);
        }

    }
}
