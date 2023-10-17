package algorithmProblems;

public class IsPrime {

    public static boolean isPrime(int number){
        if (number<=1){
            return  false;
        }

        if (number<=3){
            return true;
        }

        if (number%2==0){
            return false;
        }

        for (int i=3;i<=Math.sqrt(number);i+=2){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }


}
