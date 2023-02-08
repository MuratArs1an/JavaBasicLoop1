package Demo;
import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        int n;
        String star="*";
        Scanner input=new Scanner(System.in);
        System.out.println("Ucgenin Satir sayisini giriniz");
        n=input.nextInt();
        for (int a=0; a<n; a++){
            star+="**";
        }
        for(int i=1; i<=n; i++){
            for(int j=2; j<=i; j++){
                System.out.print(" ");
            }
            star=star.substring(0,star.length()-2);
            System.out.println(star);
        }
    }
}
