import java.util.Scanner;

public class Main01 {

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int p=Math.max(n,m);
        int q=Math.min(n,m);
        int max=0;
        for (int i=q;i>1;i--){
            if (p%i==0 && q%i==0){
                max=i;
                break;
            }

        }
        System.out.println(max);
        System.out.println(m*n/max);
    }
}