
public class q36 {

    public static void main(String[] args) {
        Solution s = new Solution();
        char[][] exp = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'}, 
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, 
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, 
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, 
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, 
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, 
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, 
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, 
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(s.isValidSudoku(exp));
    }
}

class Solution {

    public boolean isValidSudoku(char[][] board) {
        for (int r = 0; r < 9; r++) {
            int startOfBoxRow = 3*(r/3);
            for (int c = 0; c < 9; c++) {
                int startOfBoxCol = 3*(c/3);
                char var = board[c][r];

                if (var == '.') continue;

                for (int x = 0; x < 9; x++){
                    
                    if (x != r && board[c][x] == var) return false;
                    if (x != c && board[x][r] == var) return false;

                    int boxRow = startOfBoxRow + x/3;
                    int boxCol = startOfBoxCol + x%3;
                    
                    if ((boxRow != r || boxCol != c) && board[boxCol][boxRow] == var) return false;
                }
            }
        }

        return true;
    }
}
