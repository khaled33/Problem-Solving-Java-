import java.util.Scanner;

public class Hulk {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input=sc.nextInt();

        for (int i = 1; i <= input; i++) {
            if (i==input && i%2!=0){
                System.out.print("I hate it");
            }
            else if (i%2==0 ){

                System.out.print("I love it ");
            }else  {
                System.out.print("I hate that ");
            }
        }
    }
}
