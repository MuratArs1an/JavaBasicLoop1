package Demo;
import java.util.Scanner;
public class LoopWork5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,k;
        int total=1;
        System.out.println("Sayiyi giriniz");
        n=input.nextInt();
        System.out.println("Us bilgisini giriniz");
        k=input.nextInt();
        for(int i=1; i<=k; i++){
            total*=n;
        }
        System.out.println(total);
    }
}
