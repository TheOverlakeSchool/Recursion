public class Recursion {

    public static void main(String[] args) {
        printStars(5);
        printStarsRecursive(5);
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

}
