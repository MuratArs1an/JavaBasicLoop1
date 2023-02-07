package Demo;
import java.util.Scanner;

public class AtmWork {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String userName, password;
        int counter=3;
        int balance=1000;
        int selected;
        while(counter>0){
            System.out.println("kullanici Adini Giriniz");
            userName=input.nextLine();
            System.out.println("Parolinizi Giriniz");
            password=input.nextLine();
            if(userName.equals("murat") && password.equals("1234")){
                System.out.println("Hosgeldiniz");
                do {
                    System.out.println("1-Para Cek\n"+
                            "2-Para Yatirma\n"+
                            "3-Bakiye Ogrenme\n"+
                            "4-Cikis Yap");
                    selected=input.nextInt();
                    if(selected==1){
                        System.out.println("Cekmek istedginiz Miktari giriniz");
                        int prize=input.nextInt();
                        if(prize>balance){
                            System.out.println("Yetersiz Bakiye");
                        }else{
                            balance-=prize;
                            System.out.println("Toplam Bakiyeniz: "+balance);
                        }
                    }else if(selected==2){
                        System.out.println("Yatirmak istediginiz Miktari cekiniz");
                        int prize=input.nextInt();
                        balance+=prize;
                        System.out.println("Toplam Bakiyeniz: "+balance);
                    }else if(selected==3){
                        System.out.println("Bakiyeniz: "+balance);
                    }
                }while(selected!=4);
                break;
            }else{
                counter--;
                if(counter==0){
                    System.out.println("Hesabiniz Bloke oldu");
                }
                System.out.println("Hatali Giris Yaptiniz, kalan hakkiniz: "+ counter);
            }
        }

    }
}
