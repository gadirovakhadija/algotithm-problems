package algorithmProblems;

public class AddBinary {

    public static Integer fromBinaryToInteger(String binary) {

        int binaryNumber = Integer.parseInt(binary);
        int integerNumber = 0;
        for (int i = 0; i < binary.length(); i++) {

            int x = binaryNumber % 10;
            binaryNumber = binaryNumber / 10;
            integerNumber += x * Math.pow(2, i);

        }
        return integerNumber;
    }

    public static String fromIntegerToBinary(Integer number) {
        StringBuilder s = new StringBuilder();
        Integer z = 0;
        if (number==0){
            s.append("0");
        }
        while (number > 0) {
            int y = number % 2;
            s.append(y);
            number = number / 2;

        }
        return s.reverse().toString();
    }

    public static String addBinary(String a, String b) {
        int x = fromBinaryToInteger(a) + fromBinaryToInteger(b);
        return fromIntegerToBinary(x);
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "100"));
    }
}
