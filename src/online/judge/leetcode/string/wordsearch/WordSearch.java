package online.judge.leetcode.string.wordsearch;

public class WordSearch {

    public static void main(String args[]) {


        Solution solution = new Solution();
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};


        System.out.println(solution.exist(board, "ABCCED"));
/*        System.out.println(solution.exist(board, "SEE"));
        System.out.println(solution.exist(board, "ABCB"));
        char[][] board_1 = {{'a', 'a'}};
        System.out.println(solution.exist(board_1, "aa"));

        char[][] board_2 = {{'C', 'A', 'A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}};
        System.out.println(solution.exist(board_2, "AAB"));*/
    }

}

class Solution {
    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (isExists(board, word, 0, i, j)) return true;
                }
            }
        }

        return false;
    }

    public boolean isExists(char[][] board, String word, int searchStr, int r, int c) {
        if (word.length() == searchStr) return true;
        if (!isValid(board, r, c) || board[r][c] == '0' || word.charAt(searchStr) != board[r][c]) return false;
        char temp = board[r][c];
        board[r][c] = '0';
        if (isExists(board, word, searchStr + 1, r + 1, c)) return true;
        if (isExists(board, word, searchStr + 1, r - 1, c)) return true;
        if (isExists(board, word, searchStr + 1, r, c + 1)) return true;
        if (isExists(board, word, searchStr + 1, r, c - 1)) return true;
        board[r][c] = temp;
        return false;
    }

    public static boolean isValid(char[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length;
    }
}