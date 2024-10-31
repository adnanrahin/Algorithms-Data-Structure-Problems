package online.judge.LeetCode.BackTracking.SurroundedRegion;

import java.util.Arrays;

public class SurroundedRegions {

    public static void main(String[] args) {

        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};

        solve(board);

        System.out.println(Arrays.deepToString(board));
        
        char[][] board2 = {{'X','O','X','O','X','O'},{'O','X','O','X','O','X'},{'X','O','X','O','X','O'},{'O','X','O','X','O','X'}};

        solve(board2);

        System.out.println(Arrays.deepToString(board2));
        
        char[][] board3 = {{'X','O','X','O','X','O'},{'O','X','O','X','O','X'},{'X','O','X','O','X','O'},{'O','X','O','X','O','X'}};

        solve(board3);

        System.out.println(Arrays.deepToString(board3));

    }

    public static int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public static void solve(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O' && (i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1)) {
                    depthFirstSearch(board, i, j);
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '1') {
                    board[i][j] = 'O';
                }
            }
        }

    }

    public static void depthFirstSearch(char[][] board, int row, int col) {
        if (!isValid(board, row, col)) return;
        if (board[row][col] == 'X' || board[row][col] == '1') return;

        board[row][col] = '1';

        for (int[] dir : directions) {
            depthFirstSearch(board, row + dir[0], col + dir[1]);
        }

    }

    public static boolean isValid(char[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length;
    }

}
