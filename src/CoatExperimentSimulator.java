public class CoatExperimentSimulator {

    private int numberOfPeople;

    public CoatExperimentSimulator(int numPpl) {
        numberOfPeople = numPpl;
    }

    public int numPplWhoGotTheirCoat(int[] permutation) {
        int num = 0;
        for (int i = 0; i < permutation.length; i ++){
            if (permutation[i] == i + 1){
                num ++;
            }
        }
        return num;
    }

    public int[] simulateCoatExperiment(int iterations) {
        int[] numIter = new int[iterations];
        for (int i = 0; i < numIter.length; i ++){
            int[] permutation = RandomOrderGenerator.getRandomOrder(numberOfPeople);
            numIter[i] = numPplWhoGotTheirCoat(permutation);
        }
        return numIter;
    }

    public double answerToQuestionOne(int[] results) {
        int zeroCount = 0;
        for (int i = 0; i < results.length; i ++){
            if (results[i] == 0){
                zeroCount ++;
            }
        }
        return (double) zeroCount / results.length;
    }

    public double answerToQuestionTwo(int[] results) {
        if (results.length == 0){
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < results.length; i ++){
            sum += results[i];
        }
        return (double) sum / results.length;
    }

    public static void main(String[] args) {
        int numPeople = 10;
        int iterations = 10000;

        CoatExperimentSimulator simulator = new CoatExperimentSimulator(numPeople);
        int[] results = simulator.simulateCoatExperiment(iterations);

        double probZero = simulator.answerToQuestionOne(results);
        double avgCorrect = simulator.answerToQuestionTwo(results);

        System.out.printf("People: %d, Iterations: %d%n", numPeople, iterations);
        System.out.printf("Q1: Probability of 0 people getting their coat = %.5f%n", probZero);
        System.out.printf("Q2: Average number of people getting their coat = %.5f%n", avgCorrect);
    }
}

