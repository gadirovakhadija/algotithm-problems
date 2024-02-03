package algorithmProblems.CodingChallenge.Foundations;

public class AverageArr {
    public static double averageArrFor(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
    public static double averageArrForEach(int[] arr){
        double sum=0;
        for (int elem:arr){
            sum+=elem;
        }
        return sum/ arr.length;
    }


    public static void main(String[] args) {
        System.out.println(averageArrForEach(new int[]{2, 3, 11, 5, 5}));
    }
}
