import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        n1 = input.nextInt();
        System.out.print("Bir Sayi Giriniz:");
        n2 = input.nextInt();

        System.out.println("1-Toplama");
        System.out.println("2-Cikarma");
        System.out.println("3-Carpma");
        System.out.println("4-Bolme");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam:" + n1 + n2);
                break;
            case 2:
                System.out.print("Cikarma:" + (n1 - n2));
                break;
            case 3:
                System.out.print("Carpma:" + n1 * n2);
                break;
            case 4:
                if (n2 != 0)
                    System.out.print("Bolme:" + n1 / n2);
                else System.out.print("Bir Sayi Sifira Bolunemez.Lutfen Tekrar Deneyiniz...");
                break;

            default:
                System.out.print("Tekrar Deneyiniz:");
        }

    }
}
