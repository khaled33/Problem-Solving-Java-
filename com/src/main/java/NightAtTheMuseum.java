import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char start = 'a';
        int moves = 0;

        for (int i = 0; i < input.length(); i++) {
            int result = Math.abs(input.charAt(i) - start);

            if ( result < 13) {
                moves+=result;
            }else {
                moves+=26-result;
            }
            start=input.charAt(i);
        }
        System.out.println(moves);
    }
}
