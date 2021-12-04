import java.util.Scanner;

public class LeftHandersRightHandersAndAmbidexters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int left=sc.nextInt();
        int right=sc.nextInt();
        int leftAndRight=sc.nextInt();
        int team=0;

        if (left==0&& leftAndRight==0 || right==0&& leftAndRight==0 ){
            team=0;
        }else
        team=((left+right+leftAndRight)/2)*2;

        System.out.println(team);

    }
}
