import java.util.Scanner;

public class ColorfulStones {
    static int index = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String s1 = scanner.next();

        int x = 0;
        int index = 1;
        for (int i = 0; i <s1.length() ; i++) {

            if (s.charAt(x)==s1.charAt(i)){
                index++;
                x++;

        }


        }
        System.out.println(index);

    }
}
