package pushpak16L2MethodsOverloading;
import java.util.Scanner;
/*Objects and Methods Overloading
1. Java Program to create a calculator and Return a Value from a Method.
   Explanation:
   We make a method named input which is used to get input from the user. We also make a method named add which is used to perform addition and return the result back to the input method where we finally print the result.*/
public class Calculator {
    public int input(){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();

    }
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }

    public  double add(double a,double b){
        return a+b;
    }

    public int subtract(int a,int b){
        return a-b;
    }
    public int divide(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {

        Calculator c = new Calculator();
        int a =c.input();
        int b=c.input();
        int d =c.input();

        int sum=c.add(a,b);
        System.out.println(sum);

        int ok = c.add(a,b,d);
        System.out.println(ok);

    }

}
