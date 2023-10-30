import java.util.Stack;
class Employee {
    String name;
    int empId;
    public Employee(String name, int employeeId) {
        this.name = name;
        this.empId = employeeId;
    }
    @Override
    public String toString() {
        return "Employee [Name: " + name + ", Employee ID: " + empId + "]";
    }
}

public class Ques6 {
        public static void main(String[] args) {

            Stack<Employee> employeeStack = new Stack<>();

            employeeStack.push(new Employee("Saif", 101));
            employeeStack.push(new Employee("Tushar", 102));
            employeeStack.push(new Employee("Nikhil", 103));

            while (!employeeStack.isEmpty()) {
                Employee employee = employeeStack.pop();
                System.out.println("Popped: " + employee);
            }
        }
    }
