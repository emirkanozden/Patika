import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);

        System.out.print("Yil Giriniz:");
        yil = input.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0 && yil % 400 != 0) {
                System.out.print("Artik Yil Degildir...");
            } else {
                System.out.print("Artik Yildir...");
            }
        } else {
            System.out.print("Artik Yil Degildir...");
        }
    }
}
