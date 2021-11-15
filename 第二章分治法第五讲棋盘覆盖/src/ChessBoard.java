public class ChessBoard {
    static int title = 0;

    public static void main(String[] args) {
        int size = 4;
        int[][] board = new int[size][size];
        chessBoard(0, 0, 3, 1, size, board);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j]);
                if (j == size - 1) {
                    System.out.println();
                }
            }
        }
    }

    public static void chessBoard(int tr, int tc, int dr, int dc, int size, int[][] board) {
        if (size == 1) {
            return;
        }
        int t = title++;
        int s = size / 2;
        if (dr < tr + s && dc < tc + s) {
            chessBoard(tr, tc, dr, dc, s, board);
        } else {
            board[tr + s - 1][tc + s - 1] = t;
            chessBoard(tr, tc, tr + s - 1, tc + s - 1, s, board);
        }
        if (dr < tr + s && dc >= tc + s) {
            chessBoard(tr, tc + s, dr, dc, s, board);
        } else {
            board[tr + s - 1][tc + s] = t;
            chessBoard(tr, tc + s, tr + s - 1, tc + s, s, board);
        }
        if (dr >= tr + s && dc < tc + s) {
            chessBoard(tr + s, tc, dr, dc, s, board);
        } else {
            board[tr + s][tc + s - 1] = t;
            chessBoard(tr + s, tc, tr + s, tc + s - 1, s, board);
        }
        if (dr >= tr + s && dc >= tc + s) {
            chessBoard(tr + s, tc + s, dr, dc, s, board);
        } else {
            board[tr + s][tc + s] = t;
            chessBoard(tr + s, tc + s, tr + s, tc + s, s, board);
        }
    }
}
