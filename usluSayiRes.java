import java.util.Scanner;

public class usluSayiRes {
    static int uslu(int n, int n2) {
        if (n2 > 0) {
            return n * uslu(n, n2 - 1);
        } else if (n2 < 0) {
            return uslu(n, n2 + 1) / n;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz : ");
        int n = inp.nextInt();
        System.out.print("Üs Değerini Giriniz : ");
        int n2 = inp.nextInt();
        System.out.print("Sonuç : " + uslu(n, n2));
    }
}
