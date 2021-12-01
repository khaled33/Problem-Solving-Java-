import java.util.Scanner;

public class PUM {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        for (int i = 1; i <= input*4; i++) {
            if (i%4==0 ){
                System.out.print("PM \n");
            }else System.out.print(i+" ");
        }
    }
}
