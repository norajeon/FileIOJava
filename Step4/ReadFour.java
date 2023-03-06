package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            try {
                // see if the file is there
                Scanner fileIn = new Scanner(new File("input.txt"));
                //try #2
                int sum = 0;
                while (fileIn.hasNext()) {

                    String answer = fileIn.nextLine();
                    System.out.println(answer);
                    sum += Integer.parseInt(answer);
                }
                System.out.println("The sum is " + sum);
            }

            catch (IOException e) {
                System.out.println("File not found");
            }

            // Print out a running total of all the
            // values in the input file.
        }
}