import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 1;
        int num = 1;
        int cnt = 0;

        while (true) {
            cnt++;

            if (N <= sum) {
                break;
            }

            sum += 6 * num;
            num++;
        }

        System.out.println(cnt);
    }

}
