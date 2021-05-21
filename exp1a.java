import java.util.Scanner;

public class exp1a {
    public static void main(String args[]) {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int i;
            System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Enter your choice: ");
            i = sc.nextInt();
            switch (i) {
                case 1: 
                    System.out.print("Enter the element to be inserted : ");
                    int val = sc.nextInt();
                    s.push(val);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                    break;            
                default: System.out.println("Invalid Input");
                    break;
            }
        }
    }
}

class Stack {
    int MAX = 5;
    int[] arr = new int[MAX];
    int top=-1;
    
    public void push(int value) {
        if(top >= MAX-1)
            System.out.println("Stack Overflow !!!");
        else
            arr[++top] = value;
    }

    public void pop() {
        if(top == -1)
            System.out.println("Stack Underflow !!!");
        else
            System.out.println("Popped Element is : " + arr[top--]);
    }

    public void display() {
        if(top == -1)
            System.out.println("Stack is empty !!!");
        else {
            System.out.println("Displaying contents of the stack :");
            for(int i = top; i >=0 ; i--)
                System.out.print(arr[i] +" ");
            System.out.println();
        }
    }
}