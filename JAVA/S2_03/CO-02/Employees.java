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
      
    public void showDetails() {
        System.out.println("Employee Number: " + eNo + ", Name: " + eName + ", Salary: " + eSalary);
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

        // Print all employees
        System.out.println("\nAll Employees:");
        for (Employee emp : employees) {
            emp.showDetails(); // Call showDetails() method to print employee details
        }

        // Finding employee with highest salary
        Employee highestSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].eSalary > highestSalaryEmployee.eSalary) {
                highestSalaryEmployee = employees[i];
            }
        }

        System.out.println("\nEmployee with the highest salary:");
        highestSalaryEmployee.showDetails(); // Call showDetails() method for highest salary employee

        scanner.close();
    }
}
