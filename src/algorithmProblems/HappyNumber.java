package algorithmProblems;

public class HappyNumber {
        public boolean isHappy(int n) {
            int sum = n;
            while (sum != 1 && sum!=4 ) {
                int temp = sum;
                sum = 0;
                while (temp != 0 ) {
                    int digit = temp % 10;
                    sum += digit * digit;
                    temp =temp/ 10;
                }
            }
            return sum == 1;
        }

    public boolean isHappy1(int n) {

        while (t(n)%10!=0){

        }
        return true;

    }
    public static int t(int n){
        int t =0;
        while(n!=0){
            int x = n%10;
            t +=Math.pow(x,2);
            n=n/10;
        }
        return t;
    }
}
