import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Horseshoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int index=0;
        Set<Integer> set=new HashSet<Integer>();

        for (int i = 0; i < 4; i++) {
            set.add(scanner.nextInt());


        }

        System.out.println(4-set.size());
    }
}
