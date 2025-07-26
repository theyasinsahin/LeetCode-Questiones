class Solution {
    public void solveSudoku(char[][] board) {
        if (!isOver(board)) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] == '.') {
                        for (char k = '1'; k <= '9'; k++) {
                            if (isValid(board, i, j, k)) {
                                board[i][j] = k;
                                solveSudoku(board);
                                if (isOver(board))
                                    return;
                                board[i][j] = '.';
                            }
                        }
                        return;
                    }
                }
            }
        }
    }

    public boolean isOver(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(char[][] board, int x, int y, char value) {
        // Check row and column
        for (int i = 0; i < 9; i++) {
            if (board[x][i] == value) {
                return false;
            } else if (board[i][y] == value) {
                return false;
            }
        }

        // Check the square
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[((x / 3) * 3) + i][((y / 3) * 3) + j] == value) {
                    return false;
                }
            }
        }
        return true;
    }
}