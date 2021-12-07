import java.util.Scanner;

public class BearBigBrother {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int year = 0;
        do {
            input1*=3;
            input2*=2;
            year++;

        }while (input1<=input2);

        System.out.println(year);
    }
}

