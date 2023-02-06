package Demo;
import java.util.Scanner;

public class LoopWork8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int num;
        String star="*";
        num=input.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=(num-i); j++){
                System.out.print(" ");
            }
            System.out.println(star);
            star+="**";
        }
        for(int i=1; i<=num; i++){
            for(int j=2; j<=i; j++){
                System.out.print(" ");
            }
            star=star.substring(0,star.length()-2);
            System.out.println(star);
        }
    }
}
