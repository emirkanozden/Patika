import java.util.Scanner;

public class advancedCalculator {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int n, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayi:");
            n = scan.nextInt();
            if (n == 0) {
                break;
            }
            result += n;
        }
        System.out.println("Sonuç: " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç Adet Sayı Gireceksiniz:");
        int counter = scan.nextInt();
        int n, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi:");
            n = scan.nextInt();
            if (i == 1) {
                result += n;
                continue;
            }
            result -= n;
        }
        System.out.println("Sonuç: " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int n, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayi:");
            n = scan.nextInt();

            if (n == 1)
                break;

            if (n == 0) {
                result = 0;
                break;
            }
            result *= n;
        }
        System.out.println("Sonuç: " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç Adet Sayı Gireceksiniz:");
        int counter = scan.nextInt();
        double n, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi ");
            n = scan.nextDouble();
            if (i != 1 && n == 0) {
                System.out.println("Böleni 0 giremezsiniz!!");
                continue;
            }
            if (i == 1) {
                result = n;
                continue;
            }
            result /= n;
        }
        System.out.println("Sonuç: " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz:");
        int base = scan.nextInt();
        System.out.print("Üs Değerini Giriniz:");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuç: " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Faktoriyelini Bulmak İstediğiniz Sayıyı Giriniz:");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Modunu Almak İstediğiniz Sayıyı Giriniz:");
        int n = scan.nextInt();
        System.out.print("Mod Almak İstediğiniz Sayıyı Giriniz:");
        int n2 = scan.nextInt();
        int result = n % n2;
        System.out.println("Mod: " + result);
    }

    static void areaAndPer() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kısa Kenarı Giriniz:");
        int n = scan.nextInt();
        System.out.print("Uzun Kenarı Giriniz:");
        int n2 = scan.nextInt();
        int result = 2 * (n + n2);
        int result2 = n * n2;
        System.out.println("Çevre:" + result);
        System.out.println("Alan:" + result2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1-Toplama İşlemi\n" +
                "2-Cikarma İşlemi\n" +
                "3-Carpma İşlemi\n" +
                "4-Bölme İşlemi\n" +
                "5-Üslü Sayı Hesaplama\n" +
                "6-Faktoriyel Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Dikdörtgen Çevre ve Alan Hesabı\n" +
                "0-Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz:");
            select = scan.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    areaAndPer();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış Değer Girdiniz! Lütfen Tekrar Deneyiniz...");
            }
        } while (select != 0);
    }
}