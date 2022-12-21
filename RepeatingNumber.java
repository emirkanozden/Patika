public class RepeatingNumber {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {1, 5, 4, 8, 4, 6, 8, 7, 9, 2, 2, 6, 5, 7, 5};
        int[] dublicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(dublicate, list[i])) {
                        dublicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : dublicate) {
            if (value != 0 && value % 2 == 0) {
                System.out.println(value);
            }
        }
    }

}