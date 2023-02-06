package Demo;
import java.util.Scanner;
public class LoopWork3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Deger girin");
        n=input.nextInt();
        for(int i=1; i<n; i*=4){
            System.out.println(i);
        }
    }
}
