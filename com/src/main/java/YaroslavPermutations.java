import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class YaroslavPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Nbnum = sc.nextInt();
        int tab[] = new int[Nbnum];
        String result = "";

        for (int i = 0; i < Nbnum; i++) {
            tab[i] = sc.nextInt();
        }

        int aux;
        if (Nbnum != 1) {
            for (int i = 0; i < Nbnum - 2; i++) {
                if (tab[i] == tab[i + 1]) {
                    aux = tab[i + 1];
                    tab[i + 1] = tab[i + 2];
                    tab[i + 2] = aux;
                }
            }

            for (int i = 0; i < Nbnum - 1; i++) {

                if (tab[i] == tab[i + 1]) {
                    result = "no";
                    break;
                } else result = "yes";
            }
        } else result = "no";

        System.out.println(result);
    }
}
