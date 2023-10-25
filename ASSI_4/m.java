import java.util.LinkedList;
import java.util.Queue;

public class m {

        public static void main(String[] args) {
            Queue<Integer> bangleQueue = new LinkedList<>();

            // Adding bangles to the stand
            for (int i = 1; i <= 12; i++) {
                bangleQueue.offer(i);
            }

            while (!bangleQueue.isEmpty()) {
                int removedBangle = bangleQueue.poll();
                System.out.println("Removed bangle #" + removedBangle);

            }
        }
    }


