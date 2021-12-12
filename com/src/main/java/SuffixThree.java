import java.util.Scanner;

public class SuffixThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nb = sc.nextInt();
        int index = 0;

        for (int i = 0; i < nb; i++) {
            String s = sc.next();
          if (s.substring(s.length()-2,s.length()).equals("po")){
              System.out.println("FILIPINO");
          }else if (s.substring(s.length()-4,s.length()).equals("desu") || s.substring(s.length()-4,s.length()).equals("masu")){
              System.out.println("JAPANESE");
          }else if (s.substring(s.length()-5,s.length()).equals("mnida")){
              System.out.println("KOREAN");          }
        }
    }
}
