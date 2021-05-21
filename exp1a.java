import java.io.BufferedReader;
import java.io.InputStreamReader;

class Student {
    String usn, name, program, phone;
    Student(String u, String n, String p, String ph) {
        usn = u;
        name = n;
        program = p;
        phone = p;
    }
    
    String printName() {
        return name;
    }

    String printUsn() {
        return usn;
    }

    String printprogram() {
        return program;
    }

    String printPhone() {
        return phone;
    }
}

public class exp1a {
    public static void main(String args[]) {
        Student s[] = new Student[10];
        String usn, name, program, phone;

        try(BufferedReader d = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the number of students : ");
            int n = Integer.parseInt(d.readLine());

            for(int i = 0; i < n; i++) {
                System.out.println("Enter details of student " + (i+1) + ":");
                System.out.print("USN : ");
                usn = d.readLine();
                System.out.print("Name : ");
                name = d.readLine();
                System.out.print("Program : ");
                program = d.readLine();
                System.out.print("Phone : ");
                phone = d.readLine();
                s[i] = new Student(usn, name, program, phone);
            }

            System.out.println("Displaying Entered student details:");
            System.out.println("Name \tUSN \tProgram \tPhone");
            for(int i = 0; i < n; i++)
                System.out.println(s[i].printName() + " \t" + s[i].printUsn() + " \t" + s[i].printprogram() + " \t" + s[i].printPhone());
        }catch(Exception e){}
    }
}