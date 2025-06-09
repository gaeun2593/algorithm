import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int Q = 25;
        int D = 10;
        int N = 5;
        int P = 1;

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();
            arr[i] = C;
        }

        String result = "";

        for (int j = 0; j < arr.length; j++) {
            int ans = arr[j];
            result += ans/Q + " ";
            ans = ans % Q;
            result += ans/D + " ";
            ans = ans % D;
            result += ans/N + " ";
            ans = ans % N;
            result += ans/P + "\n";
        }
            System.out.println(result);
    }
}