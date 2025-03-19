import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        StringBuffer asb = new StringBuffer(a);
        StringBuffer bsb = new StringBuffer(b);

        String re1 = asb.reverse().toString();
        String re2 = bsb.reverse().toString();

        if (Integer.valueOf(re1) > Integer.valueOf(re2)) {
            System.out.println(re1);
        } else System.out.println(re2);

    }
}