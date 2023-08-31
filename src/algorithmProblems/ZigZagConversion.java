package algorithmProblems;

    public class ZigZagConversion {
        public String convert(String s, int numRows) {
            if (numRows == 1 || s.length() <= numRows) {
                return s;
            }

            StringBuilder[] rows = new StringBuilder[numRows];
            for (int i = 0; i < numRows; i++) {
                rows[i] = new StringBuilder();
            }

            int row = 0;
            int step = 1;

            for (char c : s.toCharArray()) {
                rows[row].append(c);

                if (row == 0) {
                    step = 1;
                } else if (row == numRows - 1) {
                    step = -1;
                }

                row += step;
            }

            StringBuilder result = new StringBuilder();
            for (StringBuilder rowStr : rows) {
                result.append(rowStr);
            }

            return result.toString();
        }

        public static void main(String[] args) {
            ZigZagConversion solution = new ZigZagConversion();
            String input = "PAYPALISHIRING";
            int numRows = 3;
            String result = solution.convert(input, numRows);
            System.out.println(result);
        }
    }

//    public String convert(String s, int numRows) {
//
//
//        return "cavab";
//    }

//    public static void main(String[] args) {
//        String s = "Khadijah";
//
//        int numRows = 3;
//        int x = s.length() % numRows;
//        if (x != 0) {
//            int z = numRows - x;
//            s = s + " ".repeat(z);
//        }
//        double column = s.length() / numRows;
//
//        char[] c = s.toCharArray();
//
//
//        for (int i = 0; i < numRows; i++) {
//            int add = 0;
//            add += i;
//            System.out.println();
//            for (int j = 0; j < column; j++) {
//
//                System.out.print(c[add]);
//                add += numRows;
//
//            }
//        }
//    }

