import java.util.Scanner;
public class usluSayi {
    public static void main(String[] args) {
        int n, r;
        int total = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ussu Alincak Sayi:");
        n = inp.nextInt();

        System.out.print("Us Olacak Sayi:");
        r = inp.nextInt();

        for (int i = 1; i <= r; ) {
            total *= n;
            i++;
        }
        System.out.print(total);
    }
}
