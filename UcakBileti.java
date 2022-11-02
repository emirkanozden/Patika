import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        double mesafe, yas, normal, tutar, perkm = 0.10;
        int type;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz:");
        mesafe = input.nextInt();

        System.out.print("Yasinizi Giriniz:");
        yas = input.nextInt();


        System.out.print("Yolculuk Tipinizi Seciniz(1 => Tek Yon,2 => Gidis-Donus):");
        type = input.nextInt();


        normal = perkm * mesafe;


        if (mesafe > 0 && yas > 0) {
            if (type == 1 || type == 2) {
                if (yas <= 12) {
                    switch (type) {
                        case 2:
                            tutar = (normal * 0.5 * 0.8) * 2;
                            System.out.print("Ucretiniz: " + tutar + "...");
                            break;
                        case 1:
                            tutar = normal * 0.50;
                            System.out.print("Ucretiniz " + tutar + "...");
                    }
                }
            }
            if (type == 1 || type == 2) {
                if (yas > 12 && yas <= 24) {
                    switch (type) {
                        case 2:
                            tutar = (normal * 0.9 * 0.8) * 2;
                            System.out.print("Ucretiniz " + tutar + "...");
                            break;
                        case 1:
                            tutar = normal * 0.9;
                            System.out.print("Ucretiniz " + tutar + "...");
                    }
                }
            }
            if (type == 1 || type == 2) {
                if (yas >= 65) {
                    switch (type) {
                        case 2:
                            tutar = (normal * 0.7 * 0.8) * 2;
                            System.out.print("Ucretiniz " + tutar + "...");
                            break;
                        case 1:
                            tutar = normal * 0.7;
                            System.out.print("Ucretiniz " + tutar + "...");
                    }
                }
            }
            if (type == 1 || type == 2) {
                if (yas > 24 && yas < 65) {
                    switch (type) {
                        case 2:
                            tutar = (normal * 0.8) * 2;
                            System.out.print("Ucretiniz " + tutar + "...");
                            break;
                        case 1:
                            tutar = normal;
                            System.out.print("Ucretiniz " + tutar + "...");
                    }
                }
            } else {
                System.out.print("Hatali Veri Girdiniz...");
            }
        } else {
            System.out.print("Hatali Veri Girdiniz...");
        }
    }
}



