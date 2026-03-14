public class TicTacToeBoard {

  char[][] board = new char[3][3];

  public TicTacToeBoard() {

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = '-';
      }
    }

  }

  public void printBoard() {

    System.out.println();

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(board[i][j] + " ");
      }

      System.out.println();
    }

    System.out.println();

  }

}