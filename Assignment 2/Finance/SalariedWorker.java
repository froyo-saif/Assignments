package Finance;
    public class SalariedWorker extends WorkerDetails {
        int hoursWorked;

        public SalariedWorker(String name, double hourlyRate, int hoursWorked) {
            super(name, hourlyRate);
            this.hoursWorked = hoursWorked;
        }
        @Override
        public double getPayInfo() {
            return super.getPayInfo() * hoursWorked;
        }
    }

