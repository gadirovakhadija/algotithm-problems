package algorithmProblems.LeetCode;

import java.util.HashMap;
import java.util.Scanner;

public class RomeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ilk reqemi daxil et");
        String r1 = sc.nextLine();
        System.out.println("Ikinci reqemi daxil et");
        String r2 = sc.nextLine();


        int toplam = romaReqemleriniTopla(r1, r2);

        String toplamRomaReqemi = romaReqemineDonustur(toplam);

        System.out.println("Toplam: " + toplamRomaReqemi);
    }

    public static int romaReqemleriniTopla(String romaReqemi1, String romaReqemi2) {
        int eded1 = romaReqeminiEdedeDonustur(romaReqemi1);
        int eded2 = romaReqeminiEdedeDonustur(romaReqemi2);

        return eded1 + eded2;
    }

    public static int romaReqeminiEdedeDonustur(String romaReqemi) {
        HashMap<Character, Integer> romaHerfleri = new HashMap<Character, Integer>();
        romaHerfleri.put('I', 1);
        romaHerfleri.put('V', 5);
        romaHerfleri.put('X', 10);
        romaHerfleri.put('L', 50);
        romaHerfleri.put('C', 100);
        romaHerfleri.put('D', 500);
        romaHerfleri.put('M', 1000);

        int eded = 0;
        int evvelkiDeyer = 0;

        for (int i = romaReqemi.length() - 1; i >= 0; i--) {
            char simvol = romaReqemi.charAt(i);
            int deyer = romaHerfleri.get(simvol);

            if (deyer < evvelkiDeyer) {
                eded -= deyer;
            } else {
                eded += deyer;
                evvelkiDeyer = deyer;
            }
        }

        return eded;
    }

    public static String romaReqemineDonustur(int eded) {
        if (eded < 1 || eded > 3999) {
            throw new IllegalArgumentException("Geçerli bir Roma rakamı elde edilemedi.");
        }

        String[] tekler = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] onlar = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] yuzler = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] minler = {"", "M", "MM", "MMM"};

        String teklikler = tekler[eded % 10];
        String onluqlar = onlar[(eded % 100) / 10];
        String yuzlukler = yuzler[(eded % 1000) / 100];
        String minlikler = minler[eded / 1000];

        return minlikler + yuzlukler + onluqlar + teklikler;
    }
}

