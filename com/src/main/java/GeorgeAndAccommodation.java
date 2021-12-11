import java.util.Scanner;

public class GeorgeAndAccommodation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NBnum = scanner.nextInt();
int nbChanbres=0;
        for (int i = 0; i < NBnum; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (b-a>2){
                nbChanbres++;
            }
        }

        System.out.println(nbChanbres);
    }
}
