import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        int n, r, total;
        int nfaktoriyel = 1, rfaktoriyel = 1, farkfaktoriyel = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Eleman Sayisi Giriniz:");
        n = scan.nextInt();
        System.out.print("Grup Sayisi Giriniz:");
        r = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            nfaktoriyel = nfaktoriyel * i;
        }
        for (int k = 1; k <= r; k++) {
            rfaktoriyel = rfaktoriyel * k;
        }
        for (int j = 1; j <= (n - r); j++) {
            farkfaktoriyel *= j;
        }
        total = nfaktoriyel / (rfaktoriyel * farkfaktoriyel);
        System.out.print("C(" + n + "," + r + ") = " + total);
    }
}