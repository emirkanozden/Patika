import java.util.Arrays;
import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu : ");
        int length = inp.nextInt();

        System.out.println("Dizinin elemanlarını giriniz : ");
        int[] list = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            int a = inp.nextInt();
            list[i] = a;
        }
        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));
    }
}
