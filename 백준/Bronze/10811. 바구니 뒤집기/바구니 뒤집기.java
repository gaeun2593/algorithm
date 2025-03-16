import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        // N 크기 만큼의 배열 생성 후 1부터 숫자 넣기
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int num = 0;

        // 배열의 i번째부터 j번째까지 역순으로 대입. M번 만큼 반복
        for (int a = 0; a < M; a++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            for (int k = i; k <= j; k++, j--) {
                num = arr[k];
                arr[k] = arr[j];
                arr[j] = num;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}