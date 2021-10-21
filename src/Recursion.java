import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) throws FileNotFoundException {
//        printStars(5);
//        printStarsRecursive(5);
//        Scanner scanner = new Scanner(new File("input.txt"));
//        reverseLines(scanner);
//        System.out.println(pow(2,-2));
//        printBinary(-6);
        System.out.println(isPalindrome2("madamimadam"));
    }

    // Prints a line containing the given number of stars.
    // Precondition: n >= 0
    public static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();   // end the line of output
    }

    public static void printStarsRecursive(int n) {
        if (n == 0) {
            System.out.println();
        } else {
            System.out.print("*");
            printStarsRecursive(n-1);
        }
    }

    public static int mystery(int n) {
        if (n < 10) {
            return n;
        } else {
            int a = n / 10;
            int b = n % 10;
            return mystery(a + b);
        }
    }

    public static int mystery2(int n) {
        if (n < 10) {
            return (10 * n) + n;
        } else {
            int a = mystery2(n / 10);
            int b = mystery2(n % 10);
            return (100 * a) + b;
        }
    }

    public static void reverseLines(Scanner scanner) {
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            reverseLines(scanner);
            System.out.println(line);
        }
    }

    public static double pow(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp % 2 == 0) {
            return pow(base * base, exp/2);
        } else if (exp > 0){
            return base * pow(base, exp - 1);
        } else {
            return 1.0/pow(base, -exp);
        }
    }

    public static void printBinary(int value) {
        if (value < 0) {
            System.out.print("-");
            printBinary(-value);
        } else if (value < 2) {
            System.out.print(value);
        } else {
            printBinary(value / 2);
            System.out.print(value % 2);
        }
    }

    public static boolean isPalindrome(String str) {
        if (str.length() < 2) {
            return true;
        } else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            if (first != last) {
                return false;
            }
            String middle = str.substring(1,str.length()-1);
            return isPalindrome(middle);
        }
    }

    public static boolean isPalindrome2(String str) {
        return str.length() < 2 ||
                (str.charAt(0) == str.charAt(str.length() - 1)) &&
                isPalindrome2(str.substring(1,str.length()-1));
    }
}
