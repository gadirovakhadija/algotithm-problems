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
}
