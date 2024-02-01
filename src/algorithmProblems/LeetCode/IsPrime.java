package algorithmProblems.LeetCode;

public class IsPrime {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*MAth.sqrt()
     * number is 15
     * sqrt of 15 is 3
     * it try 1 2 3 and 3 will divide
     * dont need to check 4-14 because couple of 3*5 at this side
     * */
    public static boolean isPrime1(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {

                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPrime1(25));
    }


}
