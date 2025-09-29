import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] split = s.split("");

		int count = 0;

		for (int i = 0; i < split.length; i++) {
			if (split[i].equals(split[split.length - (i + 1)])) {
				count++;
			} else {
				count = 0;
			}
		}

		if (count == split.length) {
			System.out.println(1);
		} else
			System.out.println(0);
	}
}
