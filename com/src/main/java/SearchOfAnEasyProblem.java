import java.util.Scanner;

public class SearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nb = sc.nextInt();
        int index = 0;

        for (int i = 0; i < nb; i++) {
            int s = sc.nextInt();
            if (s == 1) {
                index++;
                break;
            }
        }
        if (index >= 1) {
            System.out.println("HARD");

        } else System.out.println("EASY");

    }
}
