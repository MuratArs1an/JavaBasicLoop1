package Demo;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1, num2;
        int ebob=1;
        System.out.println("Ebob ve Ekoku Bulunacak Sayilari giriniz");
        num1= input.nextInt();
        num2= input.nextInt();
        if(num1<num2){
            for(int i=num1; i>=1; i--){
                if(num1%i==0 && num2%i==0){
                    ebob=i;
                    break;
                }
            }
        }else{
            for(int i=num2; i>=1; i--){
                if(num1%i==0 && num2%i==0){
                    ebob=i;
                    break;
                }
            }
        }
        System.out.println(ebob);
        int ekok=(num1*num2)/ebob;
        System.out.println(ekok);
    }
}
