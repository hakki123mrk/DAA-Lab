import java.util.Scanner;

public class exp3a {
    public static void main(String args[])
    throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter the value of a : ");
        a = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the value of b : ");
        b = Integer.parseInt(sc.nextLine());
        try {
            System.out.println(a + "/" + b + " : " + a/b);
        }catch(Exception e) {
            System.out.println("Unable to divide by zero");
        }
    }
}
