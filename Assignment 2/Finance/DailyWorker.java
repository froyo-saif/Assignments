package Finance;

public class DailyWorker extends WorkerDetails  {
        int hours_worked;

        public DailyWorker(String name, double hourlyRate, int hours_worked) {
            super(name, hourlyRate);
            this.hours_worked = hours_worked;
        }

        @Override
        public double getPayInfo() {
            // Calculate pay for DailyWorker based on hours worked
            return super.getPayInfo() * hours_worked;
        }
    }

