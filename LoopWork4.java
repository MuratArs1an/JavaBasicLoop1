package Demo;
import java.util.Scanner;

public class LoopWork4 {
    public static void main(String[] args) {
        int n,r;
        Scanner input=new Scanner(System.in);
        System.out.println("N degerini giriniz");
        n=input.nextInt();
        System.out.println("r degerini giriniz");
        r=input.nextInt();
        int total1=1;
        int total2=1;
        int total3=1;
        int r2=n-r;
        for(int i=1; i<=n; i++){
            total1=total1*i;
        }
        for (int j=1; j<=r2; j++){
            total2=total2*j;
        }
        for (int a=1; a<=r; a++){
            total3=total3*a;
        }
        double result=total1/(total3*total2);
        System.out.println(result);
    }
}
