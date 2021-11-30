import java.util.Scanner;

public class Factorial {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int Res = 1;

        for (int i = 1; i <= input; i++) {
            Res *= i;
        }
        System.out.println(Res);

        // Récursivité
        System.out.println(fact(input));

    }

    private static int fact(int num) {
        if (num == 0) return 1;
        return num * fact(num - 1);
    }
}

