import java.util.Scanner;

public class GameLogic {

  TicTacToeBoard board = new TicTacToeBoard();
  Scanner scanner = new Scanner(System.in);

  char currentPlayer = 'X';
  int moves = 0;

  public void startGame() {

    while (true) {

      board.printBoard();

      System.out.println("Player " + currentPlayer + " turn");

      System.out.print("Enter row (0-2): ");
      int row = scanner.nextInt();

      System.out.print("Enter column (0-2): ");
      int col = scanner.nextInt();

      if (board.board[row][col] == '-') {
        board.board[row][col] = currentPlayer;
        moves++;
      } else {
        System.out.println("Cell already filled. Try again.");
        continue;
      }

      if (checkWinner()) {
        board.printBoard();
        System.out.println("Player " + currentPlayer + " wins!");
        break;
      }

      if (moves == 9) {
        board.printBoard();
        System.out.println("Game Draw!");
        break;
      }

      switchPlayer();

    }

  }

  public void switchPlayer() {

    if (currentPlayer == 'X')
      currentPlayer = 'O';
    else
      currentPlayer = 'X';

  }

  public boolean checkWinner() {

    char[][] b = board.board;

    for (int i = 0; i < 3; i++) {
      if (b[i][0] == currentPlayer &&
          b[i][1] == currentPlayer &&
          b[i][2] == currentPlayer)
        return true;

      if (b[0][i] == currentPlayer &&
          b[1][i] == currentPlayer &&
          b[2][i] == currentPlayer)
        return true;
    }

    if (b[0][0] == currentPlayer &&
        b[1][1] == currentPlayer &&
        b[2][2] == currentPlayer)
      return true;

    if (b[0][2] == currentPlayer &&
        b[1][1] == currentPlayer &&
        b[2][0] == currentPlayer)
      return true;

    return false;
  }

}