import java.util.Scanner;

public class harmonikSayi {
    public static void main(String[] args) {
        int n;
        double toplam = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz:");
        n = inp.nextInt();

        for (double i = 1; i <= n; i++) {
            toplam += (1 / i);
        }
        System.out.print(toplam);
    }
}
