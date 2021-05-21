import java.util.Scanner;

public class example4 {
    public static void main(String args[]) {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            n = sc.nextInt();

            int sum = 0;
            int i = 1;
            while(i <= n) {
                sum += i;
                i++;
            }
            sc.close();
            System.out.println("Sum of " + n + " natural numbers is " + sum);
    }
}
