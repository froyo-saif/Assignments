import java.io.File;
import java.io.IOException;

public class Ques8 {
        public static void main(String[] args) {

            String filePath = "C:\\Users\\saif9\\Downloads\\mine.txt";

            File file = new File(filePath);

            if (file.exists()) {
                System.out.println("File exists.");


                if (file.isDirectory()) {
                    System.out.println("It's a directory.");
                } else if (file.isFile()) {
                    System.out.println("It's a file.");
                    System.out.println("File Name: " + file.getName());
                    System.out.println("Absolute Path: " + file.getAbsolutePath());
                }
            } else {
                System.out.println("File does not exist.");

                try {
                    if (file.createNewFile()) {
                        System.out.println("File created successfully.");
                    } else {
                        System.out.println("Failed to create the file.");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
