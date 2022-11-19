import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {

        int i, number, min = 0, max = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kac Deger Gireceksiniz:");
        int n = scan.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.print(i + ". Sayiyi Giriniz:");
            number = scan.nextInt();

            if (i == 1) {
                min = number;
                max = number;
            }
            if (number < min) {
                min = number;

            } else if (number > max) {
                max = number;
            }
        }
        System.out.println("En Buyuk Sayi:" + max);
        System.out.print("En Kucuk Sayi:" + min);
    }
}
