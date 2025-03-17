import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] arr = new double[N];

        for (int i = 0; i < N; i++) {
            double a = sc.nextDouble();
            arr[i] = a;
        }

        // 배열 돌면서 최댓값 찾기
        double max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
                sum += arr[i] / max * 100;
        }

        // 평균 구하기
        double avg = sum / N;
        System.out.println(avg);

        sc.close();
    }
}