public class q3453 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] test1 = {1,1,1};
        int[] test2 = {1,1,1};
        
        double ans = s.separateSquares(new int[][]{test1, test2});

        System.out.print(ans + ", ");
        
    }
}

class Solution {
    public double separateSquares(int[][] squares) {
        double line=0, h, areaabove, areabelow;
        int length;
        
        while (line >= 0){

            areaabove = (length + h - line)*length;
            areabelow = (line - h)*length;
        }
        return 0.0;
    }
}