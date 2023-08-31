package algorithmProblems;

public class ReverseInteger {
    public static int reverse(int x) {

        int t = 0;

        while (x != 0) {
            int z =x%10;
            if (t>Integer.MAX_VALUE/10||t<Integer.MIN_VALUE/10){
                return 0;}
            t = t * 10 + z;
            x /= 10;

        }


        return t;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-1277777030));
    }
}
