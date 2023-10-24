public class Ques4 {

        public static void main(String[] args) {
            try {
                int[] arr = null;
                int a = 5 / 0;
                String str = "Hi";
                char ch = str.charAt(10);
                int[] negativeArray = new int[-1];
                int value = arr[0];
            } catch (NegativeArraySizeException e) {
                System.out.println("NegativeArraySizeException caught");
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught");
                e.printStackTrace();
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("StringIndexOutOfBoundsException caught");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("IndexOutOfBoundsException caught");
                e.printStackTrace();
            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught");
                e.printStackTrace();
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("General Exception caught");
                e.printStackTrace();
            }
        }
    }

