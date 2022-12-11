import java.util.Scanner;

class employee {
    String Name, phNumber, Address;
    int Age, Salary;

    void printSalary() {
        System.out.println("The salary of " + this.Name + " is " + this.Salary);
    }
}

class Officer extends employee {
    String Specialization;

    Officer(String Name, String phNumber, String Address, int Age, int Salary, String Specialization) {
        this.Name = Name;
        this.phNumber = phNumber;
        this.Address = Address;
        this.Age = Age;
        this.Salary = Salary;
        this.Specialization = Specialization;
    }

    void printDetails() {
        printSalary();
        System.out.println("Manager Details");
        System.out.println("Name  : " + this.Name);
        System.out.println("Phone Number  : " + this.phNumber);
        System.out.println("Address : " + this.Address);
        System.out.println("Specialisation  : " + this.Specialization);
        System.out.println("Age  : " + this.Age);
    }
}

class Manager extends employee {
    String Department;

    Manager(String Name, String phNumber, String Address, int Age, int Salary, String Department) {
        this.Name = Name;
        this.phNumber = phNumber;
        this.Address = Address;
        this.Age = Age;
        this.Salary = Salary;
        this.Department = Department;
    }

    void printDetails() {
        printSalary();
        System.out.println("Manager Details");
        System.out.println("Name  : " + this.Name);
        System.out.println("Phone Number  : " + this.phNumber);
        System.out.println("Address : " + this.Address);
        System.out.println("Department  : " + this.Department);
        System.out.println("Age  : " + this.Age);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        String Name, phNumber, Address, Address1, Address2, Address3, Department, Specialization;
        int Age, Salary;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Officer Details");
        System.out.print("Name  : ");
        Name = sc.nextLine();
        System.out.print("Phone Number  : ");
        phNumber = sc.nextLine();
        System.out.println("Address (Max 3 lines) : ");
        Address1 = sc.nextLine();
        Address2 = sc.nextLine();
        Address3 = sc.nextLine();
        System.out.print("Specialisation  : ");
        Specialization = sc.nextLine();
        Address = Address1 + "\n" + Address2 + "\n" + Address3;
        System.out.print("Age  : ");
        Age = sc.nextInt();
        System.out.print("Salary  : ");
        Salary = sc.nextInt();
        Officer o1 = new Officer(Name, phNumber, Address, Age, Salary, Specialization);

        System.out.print("\n\n");

        System.out.println("Enter Manager Details");
        System.out.print("Name  : ");
        Name = sc.next();
        System.out.print("Phone Number  : ");
        phNumber = sc.nextLine();
        System.out.println("Address (Max 3 lines) : ");
        Address1 = sc.nextLine();
        Address2 = sc.nextLine();
        Address3 = sc.nextLine();
        System.out.print("Department  : ");
        Department = sc.nextLine();
        Address = Address1 + "\n" + Address2 + "\n" + Address3;
        System.out.print("Age  : ");
        Age = sc.nextInt();
        System.out.print("Salary  : ");
        Salary = sc.nextInt();
        Manager m1 = new Manager(Name, phNumber, Address, Age, Salary, Department);
        
        System.out.println("\n");

        sc.close();
        
        o1.printDetails();

        System.out.println("\n");

        m1.printDetails();
    }
}