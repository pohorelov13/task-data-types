package demo;

public class Tasks {

    void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    void checkSumSign() {
        int a = 5;
        int b = 7;
        if (a + b >= 0) {
            System.out.println("Sum is positive");
        } else System.out.println("Sum is negative");
    }

    void printColor() {
        int value = 65;
        if (value <= 0) {
            System.out.println("RED");
        } else if (value > 0 && value <= 100) {
            System.out.println("YELLOW");
        } else System.out.println("GREEN");
    }

    void compareNumbers() {
        int a = 3;
        int b = 12;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

    boolean checkSum(int a, int b) {
        return a + b > 10 && a + b <= 20;
    }

    void checkSign(int a) {
        if (a >= 0) {
            System.out.printf("%d is positive\n", a);
        } else System.out.printf("%d is negative\n", a);
    }

    boolean checkPositive(int a) {
        return a < 0;
    }

    void printInfo(String s, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }

    boolean checkYear(int y) {
        if (y % 4 == 0 && y % 100 != 0) {
            return true;
        } else {
            return y % 400 == 0;
        }
    }
}