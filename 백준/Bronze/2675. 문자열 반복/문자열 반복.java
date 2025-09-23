import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		int r;
		String s;
		String[] arr = new String[0];

		for (int i = 0; i < t; i++) {
			r = sc.nextInt();
			s = sc.next();

			arr = s.split("");

			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < r; k++) {
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}
	}
}
