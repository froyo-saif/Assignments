class Worker {
        String name;
        double salaryRate;

    static {
        System.out.println("Worker class has been loaded.");
    }

        public Worker(String name, double salaryRate) {
            this.name = name;
            this.salaryRate = salaryRate;
        }

        public double getSalaryRate() {
            return salaryRate;
        }

        public void setSalaryRate(double salaryRate) {
            this.salaryRate = salaryRate;
        }

        public double pay(int hours) {
            return 0; // Default implementation, to be overridden by subclasses
        }

        public String getName() {
            return name;
        }
    }

    class DailyWorker extends Worker {
        public DailyWorker(String name, double salaryRate) {
            super(name, salaryRate);
        }

        @Override
        public double pay(int daysWorked) {
            return getSalaryRate() * daysWorked;
        }
    }

    class SalariedWorker extends Worker {
        public SalariedWorker(String name, double salaryRate) {
            super(name, salaryRate);
        }

        @Override
        public double pay(int hours) {
            if (hours <= 40) {
                return getSalaryRate() * hours;
            } else {
                return getSalaryRate() * 40; // Salaried workers are paid for 40 hours a week
            }
        }
    }

    public class Ques15 {
        public static void main(String[] args) {
            DailyWorker dailyWorker = new DailyWorker("EMP1", 100.0);
            SalariedWorker salariedWorker = new SalariedWorker("EMP2", 150.0);

            System.out.println("Weekly pay for " + dailyWorker.getName() + ": $" + dailyWorker.pay(5) + " (5 days worked)");
            System.out.println("Weekly pay for " + salariedWorker.getName() + ": $" + salariedWorker.pay(45) + " (45 hours worked)");

            // Using instanceof keyword to check the type of worker
            if (dailyWorker instanceof DailyWorker) {
                System.out.println(dailyWorker.getName() + " is a Daily Worker.");
            }

            if (salariedWorker instanceof SalariedWorker) {
                System.out.println(salariedWorker.getName() + " is a Salaried Worker.");
            }
        }
    }


