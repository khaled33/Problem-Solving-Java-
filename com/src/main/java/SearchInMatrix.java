import java.util.Scanner;

public class SearchInMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int matrix[][] = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int Search = sc.nextInt();

        forlopi:
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (matrix[i][j] == Search) {
                    System.out.println("will tack number ");
                    break forlopi;
                } else if (i == a && b == i) {
                    System.out.println("will not take number ");
                }
            }

        }
    }
}
