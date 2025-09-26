public class PositiveInteger {

    private int num;

    public PositiveInteger(int number){
        num = number;
    }

    private int sumOfProperDivisors(int n) {
        int sum = 1;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                sum += i;
                int other = n / i;
                if (other != i) sum += other;
            }
        }
        return sum;
    }

    public boolean isPerfect() {
        if (num <= 1){
            return false;
        }
        return sumOfProperDivisors(num) == num;
    }

    public boolean isAbundant() {
        if (num <= 1){
            return false;
        }
        return sumOfProperDivisors(num) > num;
    }

    public boolean isNarcissistic() {
        if (num >= 0 && num < 10){
            return true;
        }

        int sum = 0;
        int tmp = num;
        while (tmp > 0){
            int lastDigit = tmp % 10;
            sum += lastDigit * lastDigit;
            tmp /= 10;
        }
        return sum == num;
    }
}