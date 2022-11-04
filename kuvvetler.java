import java.util.Scanner;

public class kuvvetler {
    public static void main(String[] args) {
        int i, j, numara;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz:");
        numara = inp.nextInt();

        for (i = 1; i <= numara; i *= 4) {
            System.out.println("4'ün Kuvvetleri : " + i);
        }

        System.out.println("*///////////////////////*");

        for (j = 1; j <= numara; j *= 5) {
            System.out.println("5'in Kuvvetleri : " + j);
        }
    }
}