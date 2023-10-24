package Finance;
public class printDetails {
        public static void main(String[] args) {
            WorkerDetails worker1 = new DailyWorker("Saif", 10.0, 40);
            WorkerDetails worker2 = new SalariedWorker("Khan", 15.0, 200);

            double pay1 = worker1.getPayInfo();
            double pay2 = worker2.getPayInfo();

            System.out.println("Monthly pay for " + worker1.getClass().getSimpleName() + " " + worker1.getName() + ": $" + pay1);
            System.out.println("Monthly pay for " + worker2.getClass().getSimpleName() + " " + worker2.getName() + ": $" + pay2);
        }
    }

