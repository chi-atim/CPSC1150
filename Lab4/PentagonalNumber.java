public class PentagonalNumber {
	public static void main(String[] args) {
            for (int i = 1 ; i <= 10 ; i++) {
                  System.out.print(getPentagonalNumber(i));
                  if (i % 10 == 0) {
                        System.out.println();
                  } else {
                        System.out.print("\t");
                  }
	      }
      }

      public static int getPentagonalNumber(int num) {
            return (3 * num * num - num) / 2;
	}
}
