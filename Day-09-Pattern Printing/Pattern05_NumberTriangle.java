public class Pattern05_NumberTriangle {
  public static void main(String[] args) {

    int n = 4;

    for (int row = 1; row <= n; row++) {
      for (int num = 1; num <= row; num++) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}
