import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------");
        boolean isPOne = isPalindrome(-1221);
        boolean isPTwo = isPalindrome(707);
        boolean isPThree = isPalindrome(11212);
        System.out.printf("isPalindrome(-1221) = %s\nisPalindrome(707) = %s\nisPalindrome(11212) = %s\n", isPOne,
                isPTwo, isPThree);

        System.out.println("-----------------");

        boolean isPFOne = isPerfectNumber(6);
        boolean isPFTwo = isPerfectNumber(28);
        boolean isPFThree = isPerfectNumber(5);
        boolean isPFFour = isPerfectNumber(-1);
        System.out.printf(
                "isPerfectNumber(6) = %s\nisPerfectNumber(28) = %s\nisPerfectNumber(5) = %s\nisPerfectNumber(-1) = %s\n",
                isPFOne, isPFTwo, isPFThree, isPFFour);

        System.out.println("-----------------");

        String nTWOne = numberToWords(123);
        String nTWTwo = numberToWords(1010);
        String nTWThree = numberToWords(-1);
        System.out.printf("numberToWords(123) = %s\nnumberToWords(1010) = %s\nnumberToWords(-1) = %s\n", nTWOne,
                nTWTwo, nTWThree);
        System.out.println("--------------------------------------------------------------------");

    }

    static boolean isPalindrome(int x) {
        x = Math.abs(x);
        int y = 0, z = x;

        while (z > 0) {
            y = y * 10 + z % 10;
            z /= 10;
        }
        return x == y;
    }

    static boolean isPerfectNumber(int x) {
        if (x < 1) {
            return false;
        }
        int y = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                y += i;
            }
        }
        return x == y;
    }

    static String numberToWords(int x) {
        if (x < 0) {
            return "Invalid Value";
        }
        String numbers[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        String str = "";
        String y[] = String.valueOf(x).split("");
        for (int i = 0; i < y.length; i++) {
            Integer idx = Integer.parseInt(y[i]);
            str += numbers[idx] + " ";

        }
        return str;
    }
}