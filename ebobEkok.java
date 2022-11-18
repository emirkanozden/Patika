import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        int n1, n2, ebob = 1, ekok, i = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz:");
        n1 = input.nextInt();

        System.out.print("Bir Sayi Giriniz:");
        n2 = input.nextInt();

        while (i <= n1) {
            i++;
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }
        ekok = (n1 * n2) / ebob;
        System.out.println("Ebob:" + ebob);
        System.out.println("Ekok:" + ekok);
    }
}
