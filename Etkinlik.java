import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        int temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava Kac Derece:");
        temp = input.nextInt();

        if (temp < 5) {
            System.out.print("Kayak Yapabilirsiniz...");
        } else if (temp >= 5 && temp < 15) {
            System.out.print("Sinemaya Gidebilirsiniz...");
        } else if (temp >= 15 && temp < 25) {
            System.out.print("Piknik Yapabilirsiniz...");
        } else {
            System.out.print("Yuzmeye Gidebilirsiniz...");
        }
    }
}
