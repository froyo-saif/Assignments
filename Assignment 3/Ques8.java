class InvalidEmployeeCodeException extends Exception {
    public InvalidEmployeeCodeException(String message) {
        super(message);
    }
}

class Employee {
    String employeeID;
    String name;
    int yearOfBirth;

    public Employee(String employeeID, String name, int yearOfBirth) {
        this.employeeID = employeeID;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Year of Birth: " + yearOfBirth);
    }

    public static boolean isValidEmployeeCode(String employeeID) {

        if (employeeID.matches("\\d{2}-(F|S)-\\d{3}")) {
            return true;
        }
        return false;
    }

    public static Employee createEmployee(String employeeID, String name, int yearOfBirth) throws InvalidEmployeeCodeException {
        if (isValidEmployeeCode(employeeID)) {
            return new Employee(employeeID, name, yearOfBirth);
        } else {
            throw new InvalidEmployeeCodeException("Invalid Employee Code: " + employeeID);
        }
    }
}

public class Ques8 {
    public static void main(String[] args) {
        try {
            String employeeID = "81-F-112";
            String name = "John Doe";
            int yearOfBirth = 1990;

            Employee employee = Employee.createEmployee(employeeID, name, yearOfBirth);
            employee.displayDetails();
        } catch (InvalidEmployeeCodeException e) {
            System.out.println(e.getMessage());
        }
    }
}


