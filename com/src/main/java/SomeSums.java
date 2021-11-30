import java.util.Scanner;

public class SomeSums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int SomeSums = 0;

        for (int i = 1; i <= num; i++) {
            int res = 0;

            if (i <= 9 && i >= A && i <= B) {
                SomeSums += i;
                System.out.println(i+"++"+SomeSums);

            }


            else if (i > 9) {
                res = i;
                int somDigit = 0;

                while (res > 0) {

                    int somDigit1 = res % 10;
                    somDigit += somDigit1;
                    res /= 10;
                }
                if (somDigit >= A && somDigit <= B) {
                    System.out.println(i+"++"+somDigit);

                    SomeSums += i;

                }

            }

        }
        System.out.println(SomeSums );
    }
}
