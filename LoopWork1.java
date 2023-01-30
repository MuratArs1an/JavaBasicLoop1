package Demo;
import java.util.Scanner;

public class LoopWork1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        int total=0;
        int counter=0;
        int result=0;
        System.out.println("Bir sayi giriniz");
        a=input.nextInt();
        for(int i=0; i<=a; i++){
            if(i%12==0){
                total+=i;
                counter++;
            }
        }
        if(counter>1){
            result=total/(counter-1);
            System.out.println(result);
        }else{
            System.out.println("3 ve 4 e bolunebilen sayi yoktur");
        }

    }
}
