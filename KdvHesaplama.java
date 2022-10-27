import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran1=0.18, kdvOran2=0.08,kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutar Giriniz:");
        tutar = input.nextDouble();

        kdvTutar = tutar <= 1000 ? (tutar*kdvOran1):(tutar*kdvOran2);
        kdvliTutar = tutar <= 1000 ? (tutar*kdvOran1+tutar):(tutar*kdvOran2+tutar);


        System.out.println("Tutar:"+tutar);
        System.out.println("1000 TL Alti KDV Orani:"+kdvOran1);
        System.out.println("1000 TL Uzeri KDV Orani:"+kdvOran2);
        System.out.println("KDV Tutari:"+kdvTutar);
        System.out.println("Kdvli Tutar:"+kdvliTutar);
    }
}