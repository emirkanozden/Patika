import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        int n;

        Scanner klavye = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz:");
        n = klavye.nextInt();

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
