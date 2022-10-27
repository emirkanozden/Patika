import java.util.Scanner;
public class DaireAlan {
    public static void main(String[] args) {
    double pi = 3.14, yaricap, merkezaci, alan, cevre;
    Scanner input = new Scanner(System.in);

    System.out.print("Yaricap Giriniz:");
    yaricap = input.nextDouble();
    System.out.print("Merkez Aci:");
    merkezaci = input.nextDouble();

    cevre = 2 * pi * yaricap;
    alan = (pi * (yaricap * yaricap)* merkezaci) / 360;

    System.out.println("Dairenin Cevresi:" +cevre);
    System.out.println("Dairenin Alani:" + alan);


    }
}
