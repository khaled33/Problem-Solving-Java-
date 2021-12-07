import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NBnum = scanner.nextInt();
        int tab[][] = new int[NBnum][3];

        for (int i = 0; i < NBnum; i++) {
            for (int j = 0; j < 3; j++) {
                tab[i][j] = scanner.nextInt();
            }
        }

        int index = 0;
        int result = 0;
        for (int i = 0; i < NBnum; i++) {
            index = 0;
            for (int j = 0; j < 3; j++) {
                if (tab[i][j] == 1)
                    index++;
            }
            if (index >= 2) {
                result++;
            }
        }
        System.out.println(result);
    }
}
