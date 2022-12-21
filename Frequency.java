import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 4, 5, 5, 5, 3, 2};
        Arrays.sort(arr);
        int count = 0;
        int tempnumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || tempnumber != arr[i]) {

                for (int k : arr) {
                    if (arr[i] == k) {
                        count++;
                        tempnumber = arr[i];
                    }
                }
                System.out.println("Element: " + arr[i] + " Frequency: " + count);
                count = 0;
            }
        }
    }
}