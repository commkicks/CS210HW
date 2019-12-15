// This program reads an input file of hours worked by various
// employees and reports the total hours worked by each.

import java.io.*;
import java.util.*;

public class HoursWorked {
    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner input = new Scanner(new File("hours2.dat"));
        process(input);
    }
    
    public static void process(Scanner input) throws FileNotFoundException {
        PrintStream output = new PrintStream(new File("MarvelleChristopher_hours_output.txt"));
        output.println("Output from HourWorked:");
        input.next();//skip the first ID #
        do{//now work!!!
            String name = input.next();
            double sum = 0.0;
            while (input.hasNextDouble()) {
                sum += input.nextDouble();
            }
            System.out.println("Total hours worked by " + name + " = " + sum);
            output.println("Total hours worked by " + name + " = " + sum);
        }while (input.hasNext());
    }
}
