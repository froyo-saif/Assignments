package house;

public class Kitchen {
        public void printAppliances() {
            String[] appliances = {"Stove", "Refrigerator", "Microwave", "Mixer"};
            System.out.println("Appliances in the kitchen:");
            for (String appliance : appliances) {
                System.out.println(appliance);
            }

            // Copy the array to a different array
            String[] copiedAppliances = new String[appliances.length];
            System.arraycopy(appliances, 0, copiedAppliances, 0, appliances.length);

            System.out.println("Copied appliances:");
            for (String copiedAppliance : copiedAppliances) {
                System.out.println(copiedAppliance);
            }
        }
    }

