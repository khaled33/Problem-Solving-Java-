import java.util.Scanner;

public class AnotherOneBitesTheDust {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        long a = 0, b = 0;
        for (int i = 0; i < 3; i++) {
            int s = sc.nextInt();
            if (i == 0) {
                a = a + s;
            } else if (i == 1) {
                b = b + s;
            } else {
                a = a + s;
                b = b + s;

            }
        }
         long min = Math.min(a, b);
        if (a == b) {

            System.out.println(min * 2);
        } else
            System.out.println(min * 2 + 1);

    }
}

