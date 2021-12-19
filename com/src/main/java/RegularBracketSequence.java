import java.util.Scanner;

public class RegularBracketSequence {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String s=sc.next();

        int counter=0;
        int size=s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(') {
                counter++;
            }else {
                counter--;
                if (counter<0){
                    size--;
                    counter=0;
                }
            }
         }
        System.out.println(size-counter);


    }
}
