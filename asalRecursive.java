import java.util.Scanner;

public class asalRecursive {
    static int i = 2;

    static boolean asal(int n) {
        if (n % i == 0 && n != 2 || n == 1)
            return false;
        if (i >= n / 2)
            return true;
        i++;
        return asal(n);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        int n = inp.nextInt();

        if (asal(n) == true) {
            System.out.print(n + " Sayısı Asal Sayıdır...");
        } else {
            System.out.print(n + " Sayısı Asal Sayı Değildir...");
        }
    }
}
