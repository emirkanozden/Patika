import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.1,muz=2,patlican=3,toplam;
        double armutkg,elmakg,domateskg,muzkg,patlicankg;

        Scanner input = new Scanner(System.in);

        System.out.print("Kac Kilo Armut:");
        armutkg = input.nextDouble();

        System.out.print("Kac Kilo Elma");
        elmakg = input.nextDouble();

        System.out.print("Kac Kilo Domates:");
        domateskg = input.nextDouble();

        System.out.print("Kac Kilo Muz:");
        muzkg = input.nextDouble();

        System.out.print("Kac Kilo Patlican:");
        patlicankg = input.nextDouble();

        toplam =(armutkg*armut)+(elmakg*elma)+(domateskg*domates)+(muzkg*muz)+(patlicankg*patlican);

        System.out.print("Toplam Ucret:"+toplam);

    }
}
