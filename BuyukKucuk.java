package Demo;
import java.util.Scanner;

public class BuyukKucuk {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int counter;
        int num;
        int big=0;
        int small=0;
        System.out.println("Kac tane sayi gireceksiniz");
        counter=input.nextInt();

        for(int i=1; i<=counter; i++){
            System.out.println(i+" Sayiyi giriniz");
            num=input.nextInt();
            if(i==1){
                big=num;
                small=num;
            }
            if(num>big){
                big=num;
            }
            if(num<small){
                small=num;
            }
        }

        System.out.println("Buyuk sayi "+big);
        System.out.println("Kuyuk sayi "+small);
    }
}
