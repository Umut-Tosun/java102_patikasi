package ObjectOrientedProgramming.Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Tutar Giriniz : ");
        double price = input.nextDouble();

        System.out.print("Kart Numarasını Giriniz : ");
        String cardNo = input.next();

        System.out.print("Son Kullanım Tarihini Giriniz : ");
        String expiryDate = input.next();

        System.out.print("Güvenlik Kodunu Giriniz : ");
        String cvc = input.next();

        System.out.print("1.Tosun Bankası\n2.Halkbank\nSeçiminiz : ");
        int selectBank=input.nextInt();

        switch (selectBank)
        {
            case 1:
                TosunBank tb = new TosunBank("Tosun Bank","656566565665","233424343546576");
                tb.connect("56.78.7.7");
                tb.payment(price,cardNo,expiryDate,cvc);
                break;
            case 2:
                KazanBank kb = new KazanBank("Kazan Bank","65654564665","233666776576");
                kb.connect("34.22.2.2");
                kb.payment(price,cardNo,expiryDate,cvc);
            default:
                System.out.println("Hatalı Seçim");

        }
    }
}
