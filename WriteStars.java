public class WriteStars {
	public static void main(String[] args) {
		printStars(5);
	}

	private static void printStars(int n) {
		if (n == 0) {
			System.out.println();
			return;
		}
		System.out.print("*");
		printStars(n - 1);
	}
}
