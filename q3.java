
import java.util.Arrays;

class q3 {

    class Solution {

        public int lengthOfLongestSubstring(String s) {
            char[] charArr = s.toCharArray();                //parse character array
            int sl = charArr.length;                         //length of ^array

            int[] seenArr = new int[130];
            Arrays.fill(seenArr, -1);
            int start = -1, end = 0;
            int cans = -1, fans = 0;                          //start and end of substring //current and final answer

            if (sl < 2) {
                return sl;
            }

            for (int j = 0; j < sl; j++) {

                if (seenArr[charArr[j]] == -1) {
                    seenArr[charArr[j]] = j;
                    end = j;
                } else {
                    cans = end - start;
                    if (cans > fans) {
                        fans = cans;
                    }
                    start = seenArr[charArr[j]];
                    j = start;
                    Arrays.fill(seenArr, -1);
                }

            }
            cans = end - start;
            if (cans > fans) {
                fans = cans;
            }
            return fans;
        }
    }
}
