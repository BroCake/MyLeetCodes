
class q14 {

    class Solution {

        public String longestCommonPrefix(String[] strs) {
            String ans = "";                        //answer String
            char c;                                 //tracks first character
            int l = strs[0].length(), cnt = 0;                            //tracks length of prefix

            outer:
            for (int i = 0; i < l; i++) {
                c = strs[0].charAt(i);
                for (int s = 1; s < strs.length; s++) {
                    if (i >= strs[s].length() || c != strs[s].charAt(i)) {
                        break outer;
                    }
                } //end for 
                cnt++;
            } //end for outer
            ans = strs[0].substring(0, cnt);
            return ans;
        } //end lCP()
    }
}
