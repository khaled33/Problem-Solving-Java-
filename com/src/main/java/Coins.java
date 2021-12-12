import java.util.*;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        String[] tab;
        int a = 0, b = 0, c = 0;

        for (int i = 0; i < 3; i++) {
            s = sc.next();

            if (s.split(">").length == 2) {

                tab = s.split(">");
                if (tab[0].equals("A")) {
                    a++;
                }

                if (tab[0].equals("B")) {
                    b++;
                }
                if (tab[0].equals("C")) {
                    c++;
                }

            } else {

                tab = s.split("<");

                if (tab[1].equals("A")) {
                    a++;
                }

                if (tab[1].equals("B")) {
                    b++;
                }
                if (tab[1].equals("C")) {
                    c++;
                }
            }

        }

        Map<Integer, String> list = new TreeMap<>();
        list.put(a, "A");
        list.put(b, "B");
        list.put(c, "C");

        if (a == b || a == c || b == c) {
            System.out.println("Impossible");
        } else
            for (String e : list.values()
            ) {
                System.out.print(e);

            }

    }
}
