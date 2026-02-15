public class Pattern04_Pyramid {
  public static void main(String[] args) {

    int n = 4;

    for (int row = 1; row <= n; row++) {

      // spaces
      for (int space = 1; space <= n - row; space++) {
        System.out.print(" ");
      }

      // stars
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}
