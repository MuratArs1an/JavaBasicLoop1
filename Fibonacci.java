package Demo;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int fib = 0, fib2 = 1, fib3 = 0, fib4 = 0;

        System.out.println("Elememan sayisini giriniz");
        n = input.nextInt();
        for (int i = 0; i <= (n / 2 - 1); i++) {
            if (fib == 0) {
                System.out.print(fib + " " + fib2 + " ");
            }
            fib3 = fib + fib2;
            fib4 = fib2 + fib3;
            fib = fib3;
            fib2 = fib4;
            System.out.print(fib3 + " " + fib4 + " ");
        }
    }
}