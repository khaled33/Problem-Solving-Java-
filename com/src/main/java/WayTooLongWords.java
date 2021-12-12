import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nb=sc.nextInt();

        for (int i = 0; i < nb; i++) {
            String s=sc.next();

            if (s.length()>10){
                int mid=s.length()-2;
                System.out.println(s.charAt(0)+""+mid+""+s.charAt(s.length()-1));
                continue;
            }
                System.out.println(s);
        }
    }
}
