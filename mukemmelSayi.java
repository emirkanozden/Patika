import java.util.Scanner;
public class mukemmelSayi {
    public static void main(String[] args) {
        int sayi, toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        sayi = input.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == sayi) {
            System.out.print(sayi + " Mukemmel Sayidir...");
        } else {
            System.out.print(sayi + " Mukemmel Sayi Degildir...");
        }
    }
}
