
    public class ques5 {
        Object saif;

        public ques5() {
            saif = new Object();
        }
        public void work() {
            try {
                System.out.println("saif is running");
            } finally {
                saif = null;
            }
        }

        public static void main(String[] args) {
            ques5 q = new ques5();

            q.work();

            if (q.saif == null) {
                System.out.println("Saif has been stopped.");
            } else {
                System.out.println("Saif has not been reset to null.");
            }
        }
    }
