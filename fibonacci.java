import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        int a = 0, k = 1, sayi, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of components in the series:");
        sayi = input.nextInt();

        System.out.println("Fibonacci series with  " + sayi + " components:");
        System.out.print(a);

        for (int i = 1; i <= sayi; i++) {
            result = k + a;
            k = a;
            a = result;
            System.out.print(" " + result);
        }
    }
}
