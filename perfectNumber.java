package Demo;
import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args) {
        int num;
        int total=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        num=input.nextInt();
        if(num>1){
            for(int i=1; i<num; i++){
                if(num%i==0){
                    total+=i;
                }
            }
            if(total==num){
                System.out.println(num+" Mukemmel sayidir");
            }else{
                System.out.println(num+" Mukemmel sayi degildir");
            }
        }else{
            System.out.println("Gecersiz Sayi girdiniz");
        }

    }
}
