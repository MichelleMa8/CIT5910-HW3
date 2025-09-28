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
        return 0.0;
    }

    public double answerToQuestionTwo(int[] results) {
        return 0.0;
    }
}

