
import java.util.*;

public class example3 {
    public static void main(String args[]) {
        int  num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: " + sum);
    }
}
