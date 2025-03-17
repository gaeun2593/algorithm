import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String num = sc.next();
        int sum = 0;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = num.charAt(i) - 48;
            sum += arr[i];
        }
        System.out.println(sum);
    }
}