class TicTacToe {

    static boolean isValidMove(char[][] board, int row, int col) {

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid move: Out of bounds!");
            return false;
        }

        if (board[row][col] != ' ') {
            System.out.println("Invalid move: Cell already occupied!");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        // Initialize board
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        int row = 1; 
        int col = 1;

        // Validate move
        if (isValidMove(board, row, col)) {
            board[row][col] = 'X';
            System.out.println("Move accepted!");
        } else {
            System.out.println("Move rejected!");
        }
    }
}
