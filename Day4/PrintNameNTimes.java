import java.util.*;

public class PrintNameNTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        
        // print Shubh n times
        
        int n = input.nextInt();
        int counter = 0;
        while ( counter < n ) {
            // System.out.println("Shubh");
            System.out.println(counter + " : Shubh");
            
            counter = counter + 2;
            // counter = 0 + 1;
            // counter = 1;   
        }
        
    }
}
