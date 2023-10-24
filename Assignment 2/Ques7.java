public class Ques7 {
    public enum PaperCurrency {
            TenRs("Ten Rs Note"),
            TwentyRs("Twenty Rs Note"),
            FiftyRs("Fifty Rs Note"),
            HundredRs("Hundred Rs Note"),
            ThousandRs("Thousand Rs Note");
            final String description;

            PaperCurrency(String description) {
                this.description = description;
            }
            public String getDescription() {
                return description;
            }
        }

        public static void main(String[] args) {
            // Loop through the enum values and print each value
            System.out.println("Values:");
            for (PaperCurrency currency : PaperCurrency.values()) {
                System.out.println(currency);
            }
            PaperCurrency myCurrency = PaperCurrency.TenRs;
            switch (myCurrency) {
                case TenRs:
                    System.out.println("Description: " + myCurrency.getDescription());
                    break;
                case TwentyRs:
                    System.out.println("Description: " + myCurrency.getDescription());
                    break;
                case FiftyRs:
                    System.out.println("Description: " + myCurrency.getDescription());
                    break;
                case HundredRs:
                    System.out.println("Description: " + myCurrency.getDescription());
                    break;
                case ThousandRs:
                    System.out.println("Description: " + myCurrency.getDescription());
                    break;
            }
        }
    }
