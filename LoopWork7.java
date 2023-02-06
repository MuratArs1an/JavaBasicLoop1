package Demo;
import java.util.Scanner;
public class LoopWork7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int num;
        num=input.nextInt();
        double result=0;
        for(int i=1; i<=num; i++){
            result+=(1.0/i);
        }
        System.out.println(result);
    }
}
