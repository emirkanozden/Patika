import java.util.Scanner;
public class KitleIndeksi {
    public static void main(String[] args) {
        double kilo, boy;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz:");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        kilo = inp.nextDouble();

        double formul = kilo/(boy * boy);

        System.out.print("Vucut Kitle İndeksiniz:" + formul);

    }
}