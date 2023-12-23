package algorithmProblems;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        int num = 0;

        for (int i = 1; i <= rowIndex; i++) {
            num = (int) ((long) row.get(i - 1) * (rowIndex - i + 1) / i);
            row.add(num);
        }

        return row;
    }

    public static void main(String[] args) {
        System.out.println(getRow(4));
    }
}
