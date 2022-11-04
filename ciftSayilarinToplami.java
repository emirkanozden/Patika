import java.util.Scanner;

public class ciftSayilarinToplami {
    public static void main(String[] args) {
        int n;
        int total = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Bir Sayi Giriniz:");
            n = scan.nextInt();

            if (n % 4 == 0) {
                total += n;
            }
        } while (n > 0 && n % 2 == 0);
        System.out.print("Toplam " + total + " ...");
    }
}
