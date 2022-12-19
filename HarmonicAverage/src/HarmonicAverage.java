public class HarmonicAverage {
    public static void main(String[] args) {
        double[] list = {1.0, 2.0, 3.0, 4.0, 5.0};

        double avarage = 0.0;
        for (int i = 0; i < list.length; i++) {
            avarage += (1 / list[i]);
        }
        System.out.println("Harmonic Average: " + (list.length / avarage));
    }
}
