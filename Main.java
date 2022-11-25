package justforfun.numberSystemConvertation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getInRadix(4, 2));
    }

    private static List<Character> getDigitalTable() {
        List<Character> digits = new ArrayList<>();
        for (char i = '0'; i < '9'; i++) {
            digits.add(i);
        }
        for (char i = 'a'; i < 'z'; i++) {
            digits.add(i);
        }
        return digits;
    }

    public static String getInRadix(int number, int radix) {
        List<Character> digits = getDigitalTable();
        if (radix < 2 || radix >= digits.size() || number < 0) {
            throw new IllegalArgumentException();
        }

        StringBuilder valueStr = new StringBuilder();
        while (number > 0) {
            valueStr.insert(0, digits.get(number % radix));
            // сам number делим на то же основание
            number = number / radix;
        }
        return valueStr.toString();
    }
}