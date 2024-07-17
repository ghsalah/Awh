import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    @Override
    public String toString() {
        return "Employee Number: " + eNo + ", Name: " + eName + ", Salary: " + eSalary;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee number: ");
            int eNo = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter employee name: ");
            String eName = scanner.nextLine();

            System.out.print("Enter employee salary: ");
            double eSalary = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            employees[i] = new Employee(eNo, eName, eSalary);
        }

        Employee highestSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].eSalary > highestSalaryEmployee.eSalary) {
                highestSalaryEmployee = employees[i];
            }
        }

        System.out.println("\nEmployee with the highest salary:");
        System.out.println(highestSalaryEmployee);
    }
}
