
class LowSalException extends Exception {
    public LowSalException() {
        super("Basic salary is less than 50000. Salary cannot be less than 50000.");
    }
}


class Emp {
    int empId;
    String empName;
    String designation;
    double basic;
    double hra;

    public Emp(int empId, String empName, String designation, double basic) throws LowSalException {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        if (basic < 50000) {
            throw new LowSalException();
        }
        this.basic = basic;
        this.calculateHRA();
    }

    public void calculateHRA() {
        if(designation.equals("Manager")) {
            hra = 0.10 * basic;
        } else if (designation.equals("TeamLeader")) {
            hra = 0.12 * basic;
        } else if (designation.equals("HR")) {
            hra = 0.05 * basic;
        }
    }

    public void printDET() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
    }

    public double getHRA() {
        return hra;
    }

    public static void main(String[] args) {
        try {
            Emp emp1 = new Emp(1, "Saif", "Manager", 60000.0);
            emp1.printDET();

            Emp emp2 = new Emp(2, "Khan", "TeamLeader", 45000.0);
            emp2.printDET();
        } catch (LowSalException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}



