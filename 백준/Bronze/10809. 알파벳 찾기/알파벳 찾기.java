import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = new int[26];

		for (int i = 0; i < 26; i++) {
			a[i] = -1;
		}

		String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (a[ch - 'a'] == -1) {
				a[ch - 'a'] = i;
			}
		}

		for (int i = 0; i < 26; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
