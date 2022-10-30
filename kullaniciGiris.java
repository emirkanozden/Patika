import java.util.Scanner;

public class kullaniciGiris {
    public static void main(String[] args) {
        String kullaniciadi, parola, yeniparola;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullnaci Adi Giriniz:");
        kullaniciadi = input.nextLine();
        System.out.print("Parolanizi Giriniz:");
        parola = input.nextLine();

        if (parola.equals("java123")) {
            System.out.print("Sisteme Girisiniz Basarili...");

        } else {
            System.out.print("Parolaniz Hatali!Lutfen Tekrar Deneyiniz...");
            System.out.print("Parolanizi Sifirlamak Icin 1'e basiniz,iptal etmek icin 2'ye basiniz...");
            select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Yeni Parolanizi Giriniz:");
                    Scanner inp2 = new Scanner(System.in);
                    yeniparola = inp2.nextLine();
                    if (yeniparola.equals("java123")) {
                        System.out.print("Yeni Parolaniz Eskisiyle Ayni Olamaz! Lutfen Tekrar Deneyiniz...");
                    } else {
                        System.out.print("Parolaniz Degistirilmistir");
                    }
                    break;
                case 2:
                    System.out.print("Iptal Edildi...");
            }
        }
    }
}