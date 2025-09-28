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
        return null;
    }

    public double answerToQuestionOne(int[] results) {
        return 0.0;
    }

    public double answerToQuestionTwo(int[] results) {
        return 0.0;
    }
}

