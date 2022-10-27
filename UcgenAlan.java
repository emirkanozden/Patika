import java.util.Scanner;
public  class UcgenAlan{
    public static void main(String[] args) {
        double  kenar1,kenar2,kenar3;
        double alan,cevre,u;
        Scanner input = new Scanner(System.in);

        System.out.print("Kenar1 Giriniz:");
        kenar1 = input.nextDouble();
        System.out.print("Kenar2 Giriniz:");
        kenar2 = input.nextDouble();
        System.out.print("Kenar3 Giriniz:");
        kenar3 = input.nextDouble();

        u = (kenar1+kenar2+kenar3)/2;
        cevre = (kenar1+kenar2+kenar3);
        alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));

        System.out.println("Kenar1:"+ kenar1);
        System.out.println("Kenar2:"+ kenar2);
        System.out.println("Kenar3:"+ kenar3);
        System.out.println("Cevre:"+ cevre);
        System.out.println("Alan:"+ alan);
    }
}