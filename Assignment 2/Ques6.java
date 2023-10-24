public class Ques6 {

        static String staticField1 = "Initialized at the point of definition";

        static String staticField2;

        static {
            staticField2 = "Initialized in a static block";
        }

        public static void printStaticFields() {
            System.out.println("StaticField1: " + staticField1);
            System.out.println("StaticField2: " + staticField2);
        }

        public static void main(String[] args) {
            printStaticFields();
        }
    }

