import java.util.Scanner;

public class Bolum {
    public static void main(String[] args) {
        double k, toplam = 0, adet = 0;
        double average;

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz:");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
                System.out.println("Sayilar: " + i);

            }
        }
        average = toplam / (adet);
        if (toplam != 0) {
            System.out.println("Ortlama: " + average + "...");
        } else
            System.out.print("Gecersiz!!Lutfen Tekrar Deneyiniz");
    }
}