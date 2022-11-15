import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String kullaniciadi, password;
        int hak = 3, bakiye = 1500, secenek, tutar;

        Scanner input = new Scanner(System.in);

        while (hak > 0) {
            System.out.print("Kullanici Ainizi Giriniz:");
            kullaniciadi = input.nextLine();
            System.out.print("Parolanizi Giriniz:");
            password = input.nextLine();

            if (kullaniciadi.equals("patika") && (password.equals("java101"))) {
                System.out.println("**** Bankamiza Hosgeldiniz ****");
                do {
                    System.out.print("1-Para Yatirma\n" +
                            "2-Para Cekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Cikis\n");
                    System.out.print("Lutfen Yapmak Istediginiz Islemi Seciniz:");
                    secenek = input.nextInt();
                    switch (secenek) {
                        case 1:
                            System.out.print("Yatirmak Istediginiz Tutar:");
                            tutar = input.nextInt();
                            bakiye += tutar;
                            break;
                        case 2:
                            System.out.print("Cekmek Istediginiz Tutar:");
                            tutar = input.nextInt();
                            bakiye -= tutar;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz " + bakiye + " TL...");
                            break;
                    }
                } while (secenek != 4);
                System.out.println("**** Iyi Gunler Tekrar Bekleriz... ****");
                break;
            } else {
                hak--;
                System.out.println("Hatali Giris Yaptiniz!! Lutfen Tekrar Deneyiniz...");
                if (hak == 0) {
                    System.out.println("Hesabiniz Bloke Olmustur... Lutfen Bizimle Iletisime Geciniz...");
                } else {
                    System.out.println("Kalan Hakkiniz : " + hak);
                }
            }
        }
    }
}

