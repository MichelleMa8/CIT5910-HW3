import java.util.*;

public class Needle {

    private Random generator;
    public Needle() {
        generator = new Random();
    }

    public double runExperiment(int totalDrops) {
        // implement
        int hits = 0;
        for (int i = 0; i < totalDrops; i++){
            double y_low = generator.nextDouble(2);
            double alpha = generator.nextDouble(180);
            double radian = Math.toRadians(alpha);
            double y_high = y_low + Math.sin(radian);

            if (y_high >= 2){
                hits ++;
            }
        }

        if (hits == 0) {
            return Double.POSITIVE_INFINITY;
        }

        return (double) totalDrops / hits;
    }

    public static void main(String[] args) {
        Needle needle = new Needle();

        int[] trials = {1000, 10000, 100000, 1000000};
        for (int n : trials) {
            double estimate = needle.runExperiment(n);
            System.out.printf("Drops: %d, Estimated π ≈ %.6f%n", n, estimate);
        }
    }
}