import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 10개 입력 받아서 배열에 넣기
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열 순회하면서 42로 나눈 나머지를 담는 배열 생성
        int [] result = new int[10];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] % 42;
        }

        // 나머지 담은 배열 중복제거 후 배열 길이 출력
        result = Arrays.stream(result).distinct().toArray();

        System.out.println(result.length);
    }
}