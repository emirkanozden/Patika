import java.util.Scanner;

public class basamakSayisi {
    public static void main(String[] args) {
        int sayi, basamak, toplam = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        sayi = inp.nextInt();

        while (sayi != 0) {
            basamak = sayi % 10;
            toplam += basamak;
            sayi /= 10;
        }
        System.out.print("Basamak Sayilarinin Toplami = " + toplam + "...");


    }
}
