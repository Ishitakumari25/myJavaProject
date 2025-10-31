import java.util.*;

class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void showEmployeeInfo() {
        System.out.println("Employee Name: " + name + ", Position: " + position);
    }
}

class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    public void addEmployee(String name, String position) {
        employees.add(new Employee(name, position));
    }

    public void showDepartmentInfo() {
        System.out.println("\nDepartment: " + deptName);
        for (Employee e : employees) {
            e.showEmployeeInfo();
        }
    }

    public void clearEmployees() {
        employees.clear();
    }
}

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void showCompanyInfo() {
        System.out.println("Company Name: " + companyName);
        for (Department d : departments) {
            d.showDepartmentInfo();
        }
    }

    public void deleteCompany() {
        for (Department d : departments) {
            d.clearEmployees();
        }
        departments.clear();
        System.out.println("\nCompany '" + companyName + "' and all its departments and employees are deleted.");
    }
}

public class composition {
    public static void main(String[] args) {
        Company comp = new Company("Tech Solutions Pvt Ltd");

        Department d1 = new Department("HR");
        d1.addEmployee("Ishita", "HR Manager");
        d1.addEmployee("Rohan", "Recruiter");

        Department d2 = new Department("IT");
        d2.addEmployee("Priya", "Software Engineer");
        d2.addEmployee("Amit", "System Analyst");

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.showCompanyInfo();

        comp.deleteCompany();
    }
}
