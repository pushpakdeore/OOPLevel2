package pushpak16L2MethodsOverloading;
/*Java Program to Calculate Sum of Two Byte Values using Type Casting
   Explanation: This is a Java Program to Calculate Sum of Two Byte Values Using Type Casting. Type casting in Java is to cast one type, a class or interface, into another type i.e. another class or interface.
Enter any two byte values as input. After that we first convert these two bytes into integers using type casting and then we add those values and get the desired output.*/
import java.util.Scanner;

public class ByteSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first byte Value :");
        byte num1 =sc.nextByte();
        System.out.println("Enter Second byte value :");
        byte num2 = sc.nextByte();

        int sum =(int) num1+(int) num2;
        System.out.println("the sum of Byte Values :"+sum);
    }
}
