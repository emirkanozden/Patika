import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int tarih, burc;

        Scanner input = new Scanner(System.in);

        System.out.print("Dogum Yilinizi Giriniz:");
        tarih = input.nextInt();


        if (tarih % 12 == 0) {
            System.out.print("Cin Zodyagi Burcunuz MAYMUN...");
        }
        if (tarih % 12 == 1) {
            System.out.print("Cin Zodyagi Burcunuz HOROZ...");
        }
        if (tarih % 12 == 2) {
            System.out.print("Cin Zodyagi Burcunuz KOPEK...");
        }
        if (tarih % 12 == 3) {
            System.out.print("Cin Zodyagi Burcunuz DOMUZ...");
        }
        if (tarih % 12 == 4) {
            System.out.print("Cin Zodyagi Burcunuz FARE...");
        }
        if (tarih % 12 == 5) {
            System.out.print("Cin Zodyagi Burcunuz OKUZ...");
        }
        if (tarih % 12 == 6) {
            System.out.print("Cin Zodyagi Burcunuz KAPLAN...");
        }
        if (tarih % 12 == 7) {
            System.out.print("Cin Zodyagi Burcunuz TAVSAN...");
        }
        if (tarih % 12 == 8) {
            System.out.print("Cin Zodyagi Burcunuz EJDERHA...");
        }
        if (tarih % 12 == 9) {
            System.out.print("Cin Zodyagi Burcunuz YILAN...");
        }
        if (tarih % 12 == 10) {
            System.out.print("Cin Zodyagi Burcunuz AT...");
        }
        if (tarih % 12 == 11) {
            System.out.print("Cin Zodyagi Burcunuz KOYUN...");
        }
    }
}
