import java.util.Arrays;
import java.util.Scanner;

public class PanScales {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        String s1=scanner.next();


        String[] s3=s.split("\\|",2);


        if (s3[0].length()!=s3[1].length() ) {
            if (s3[0].length() < s3[1].length()) {
                s3[0] = s3[0] + s1;
            } else if (s3[0].length() > s3[1].length()) {
                s3[1] = s3[1] + s1;

            }


            if (s3[0].length() == s3[1].length()) {
                System.out.println(s3[0] + "|" + s3[1]);
            } else System.out.println("Impossible");


        } else System.out.println("Impossible");
    }
}
