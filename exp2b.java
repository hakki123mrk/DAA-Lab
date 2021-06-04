import java.util.StringTokenizer;

class Customer {
    String name, dob;
    void readData(String name, String dob) {
        this.name = name;
        this.dob =  dob;
    }

    void display() {
        StringTokenizer st = new StringTokenizer(dob);
        System.out.println("\nThe customer information is : ");
        System.out.print("Name : " + name);
        System.out.print("\tDOB : ");
        while(st.hasMoreTokens())
            System.out.print(st.nextToken("/") + ", ");
    }
}

public class exp2b {
    public static void main(String args[]) {
        Customer c1 = new Customer();
        c1.readData("Hello", "04/06/2021");
        c1.display();
    }
}