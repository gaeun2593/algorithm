import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            arr[i] = word.substring(0,1) + word.substring(word.length() - 1, word.length());
        }

        sc.close();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}