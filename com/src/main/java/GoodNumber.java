import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GoodNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NBnum = scanner.nextInt();
        int rang = scanner.nextInt();

/*int index=0;*/
int res=0;
        for (int i = 0; i < NBnum; i++) {
            int input = scanner.nextInt();
            int index=0;
            for (int j = 0; j <=rang; j++) {
                if (digits(input).contains(j)){
                    index++;
                   /* System.out.println("index"+index);
                    System.out.println("digits"+digits(input).get(j));
                    System.out.println("J"+j);*/

                }



            }
            if (index==digits(input).size()){
                res++;
            }
        }
        System.out.println(res);


    }
    private static List<Integer> digits(int number){

        List list =new ArrayList<Integer>();
        while (number>0){

            list.add(number%10);
            number/=10;
        }
        Collections.sort(list);
        return list;
    }
}
