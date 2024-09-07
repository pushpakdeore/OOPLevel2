package pushpak16L2MethodsOverloading;

public class ArithmeticSum {
    public int sum(int a, int b) {
        return a + b;
    }

     public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        ArithmeticSum arithmetic = new ArithmeticSum();

        int sumOfTwo = arithmetic.sum(10, 20);  // Sum of two numbers
        int sumOfThree = arithmetic.sum(10, 20, 30);  // Sum of three numbers
        int sumOfFour = arithmetic.sum(10, 20, 30, 40);  // Sum of four numbers

        System.out.println("Sum of two numbers: " + sumOfTwo);
        System.out.println("Sum of three numbers: " + sumOfThree);
        System.out.println("Sum of four numbers: " + sumOfFour);
    }

}
