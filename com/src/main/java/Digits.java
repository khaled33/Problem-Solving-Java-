import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int input=scanner.nextInt();
            if (input==0) System.out.println(0);
            int res=0;
            while (input>0){

                res=input%10;
                System.out.print(res+" ");
                input/=10;
            }
        }


   /*     System.out.println(123 %10);
        System.out.println(123 /10);*/
    }
}
// 123
