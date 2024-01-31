package algorithmProblems.CodingChallenge;

import java.util.Scanner;

public class SumOfTwo {

    public static int sumOfTwo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci rəqəmi daxil edin:");
        int one = sc.nextInt();
        System.out.println("İkinci rəqəmi daxil edin:");
        int two = sc.nextInt();

        return one+two;
    }

    public static void main(String[] args) {
        System.out.println(sumOfTwo());
    }

}
