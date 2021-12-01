import java.util.Scanner;

public class SummationFrom1toN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long nbNum = scanner.nextLong();

        long s=nbNum*(nbNum+1)/2;
        System.out.println(s);
    }
}
