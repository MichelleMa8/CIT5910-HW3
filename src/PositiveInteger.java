public class PositiveInteger {

    private int num;

    public PositiveInteger(int number){
        num = number;
    }

    public boolean isPerfect() {
        if (num <= 1){
            return false;
        }

        int sumFactor = 1;
        double numSqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= numSqrt; i++){
            if (num % i == 0){
                sumFactor += i;
                int other = num / i;
                if (other != i){
                    sumFactor += other;
                }
            }
        }
        return sumFactor == num;
    }

    public boolean isAbundant() {
        if (num <= 1){
            return false;
        }

        int sumFactor = 1;
        double numSqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= numSqrt; i++){
            if (num % i == 0){
                sumFactor += i;
                int other = num / i;
                if (other != i){
                    sumFactor += other;
                }
            }
        }
        return sumFactor > num;
    }

    public boolean isNarcissistic() {
        return false;
    }

}