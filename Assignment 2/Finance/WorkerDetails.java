package Finance;
public class WorkerDetails implements Payable {
        String name;
        double hour_Rate;

        public WorkerDetails(String name, double hour_Rate) {
            this.name = name;
            this.hour_Rate = hour_Rate;
        }
        @Override
        public double getPayInfo() {
            return hour_Rate;
        }
    public String getName() {
        return name;
    }

}

