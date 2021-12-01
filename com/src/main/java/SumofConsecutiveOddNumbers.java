import java.util.Scanner;

public class SumofConsecutiveOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbNum = scanner.nextInt();

        for (int i = 0; i < nbNum; i++) {
            int Num = scanner.nextInt();
            int Num1 = scanner.nextInt();

            int max = Math.max(Num,Num1);
            int min = Math.min(Num,Num1);
            int som=0;
            for (int j = min+1; j < max; j++) {
               if (j%2!=0){

                   som+=j;
               }

            }
            System.out.println(som);
        }

      }
}
