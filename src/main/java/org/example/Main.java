package org.example;
import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        performOperations();
    }

    public static void performOperations() {
        Healthplan healthplan = new Healthplan(1, "Health Plan 1", Plan.BASIC);
        System.out.println("Health Plan created: " + healthplan);

        String[] healthPlanArray = new String[3];  // Health plans array for Employee
        Employee employee = new Employee(1, "John Doe", "john.doe@example.com", "password123", healthPlanArray);

        employee.addHealthPlan(0, "Basic Plan");
        employee.addHealthPlan(1, "Premium Plan");
        employee.addHealthPlan(0, "VIP Plan");  // This will show an error because index 0 is occupied
        employee.addHealthPlan(3, "Extra Plan");

        // Step 3: Create a Company and add developer names
        String[] devNames = new String[3];  // Developer names array
        Company company = new Company(1, "Tech Corp", 100000.0, devNames);

        company.addEmployee(0, "Alice");
        company.addEmployee(1, "Bob");
        company.addEmployee(0, "Charlie");  // This will show an error because index 0 is occupied
        company.addEmployee(3, "David");  // This will show an error because index 3 is out of bounds

    }

}