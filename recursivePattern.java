import java.util.Scanner;

public class recursivePattern {
    static int i = 0, j = 0;
    static void desen(int n) {
        System.out.print(n + " ");

        if (i == j && i != 0)
            return;

        if (n > 0 && j == 0) {
            i++;
            desen(n - 5);
        } else {
            j++;
            desen(n + 5);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        int n = scan.nextInt();

        desen(n);

    }
}
