class Employee {
    int id;
    String name;
    String dept;

    Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;

        System.out.println("\nEmployee name is " + name);
        System.out.println("Employee Id is " + id);
        System.out.println("Employee belongs to the " + dept + " Department");
    }
}

class Department {
    String deptName;
    int noOfEmployees;
    Employee emp1; // aggregation: department has employee
    Employee emp2;
    Employee emp3;

    Department(String name, int numberOfEmployees, Employee e1, Employee e2, Employee e3) {
        this.deptName = name;
        this.noOfEmployees = numberOfEmployees;
        this.emp1 = e1;
        this.emp2 = e2;
        this.emp3 = e3;

        System.out.println("\nDepartment: " + deptName + " with " + noOfEmployees + " employees");
    }
}

class University {
    String universityName;
    int noOfDepartments;
    Department dept; // aggregation: university has department

    University(String name, int departments, Department d) {
        this.universityName = name;
        this.noOfDepartments = departments;
        this.dept = d;

        System.out.println("\nUniversity Name: " + universityName);
        System.out.println("Total Departments: " + noOfDepartments);
        System.out.println("Contains Department: " + dept.deptName);
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        // Create employees
        Employee s1 = new Employee(101, "Rishi", "Engineering");
        Employee s2 = new Employee(167, "Rohan", "Management");
        Employee s3 = new Employee(125, "Sneha", "Accounts");

        // Create department and pass employee references
        Department d1 = new Department("Cyber", 3, s1, s2, s3);

        // Create university and pass department reference
        University u1 = new University("ABC College of Engineering", 1, d1);
    }
}
