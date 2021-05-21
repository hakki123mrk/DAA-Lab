class Staff {
    String staffId, name, phone;
    float salary;
    Staff(String n, String stId, String ph, float sal) {
        name = n;
        staffId = stId;
        phone = ph;
        salary = sal;
    }
    void displayHeader() {
        System.out.print("\nName \tStaff ID \tPhone \t\tSalary");
    }
    void displayValues() {
        System.out.print(name + " \t" + staffId + " \t" + phone + " \t" + salary);
    }
}

class Teaching extends Staff {
    String domain, publications;
    Teaching(String n, String stId, String ph, float sal, String dom, String pub) {
        super(n, stId, ph, sal);
        domain = dom;
        publications = pub;
    }

    void display() {
        super.displayHeader();
        System.out.println(" \tDomain \tPublications");
        super.displayValues();
        System.out.println(" \t" + domain + " \t" + publications);
    }
}

class Technicals extends Staff {
    String skills;
    Technicals(String n, String stId, String ph, float sal, String skls) {
        super(n, stId, ph, sal);
        skills = skls;
    }

    void display() {
        super.displayHeader();
        System.out.println(" \tSkills");
        super.displayValues();
        System.out.println(" \t" + skills);
    }
}

class Contract extends Staff {
    String period;
    Contract(String n, String stId, String ph, float sal, String per) {
        super(n, stId, ph, sal);
        period = per;
    }

    void display() {
        super.displayHeader();
        System.out.println(" \tPeriod");
        super.displayValues();
        System.out.println(" \t" + period);
    }
}

public class exp2a {
    public static void main(String args[]) {
        Teaching teacher = new Teaching("what", "when22321", "who??????", 38.1f, "where", "how :-(");
        Technicals technician = new Technicals("heyy", "buddy33123", "whatsupp", 15.5f, "!!!");
        Contract temp = new Contract("hello", "Good4412", "Evening", 12.1f, "everyone :-)");
        teacher.display();
        technician.display();
        temp.display();
    }
}
