import java.util.*;

public class Grades {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int marks = input.nextInt();
        
        // 90 < marks <= 100, marks E (90,100]

        // VARIATION 0 ------------------------------------------------------------
        if ( marks > 90 && marks <= 100 ) {
            System.out.println("A");
        }
        else if ( marks > 80 && marks <= 90 ) {
            System.out.println("B");
        }
        else if ( marks > 60 && marks <= 80 ) {
            System.out.println("C");
        }
        else if ( marks > 40 && marks <= 60 ) {
            System.out.println("D");
        }
        else if ( marks <= 40 ) {
            System.out.println("FAIL");
        }

        // VARIATION 1 ------------------------------------------------------------
        if ( marks > 90 && marks <= 100 ) {
            System.out.println("A");
        }
        else if ( marks > 80 && marks <= 90 ) {
            System.out.println("B");
        }
        else if ( marks > 60 && marks <= 80 ) {
            System.out.println("C");
        }
        else if ( marks > 40 && marks <= 60 ) {
            System.out.println("D");
        }
        else if ( marks <= 40 ) {
            System.out.println("FAIL");
        }
        else {
            System.out.println("INVALID INPUT"); 
        }

        // VARIATION 2 ------------------------------------------------------------
        if ( marks > 90 && marks <= 100 ) {
            System.out.println("A");
        }
        else if ( marks > 80 && marks <= 90 ) {
            System.out.println("B");
        }
        else if ( marks > 60 && marks <= 80 ) {
            System.out.println("C");
        }
        else if ( marks > 40 && marks <= 60 ) {
            System.out.println("D");
        }
        else {
            System.out.println("INVALID INPUT"); 
        }
        

        // VARIATION 3 ------------------------------------------------------------
        if ( marks > 90 && marks <= 100 ) {
            System.out.println("A");
        }
        if ( marks > 80 && marks <= 90 ) {
            System.out.println("B");
        }
        if ( marks > 60 && marks <= 80 ) {
            System.out.println("C");
        }
        if ( marks > 40 && marks <= 60 ) {
            System.out.println("D");
        }
        if ( marks <= 40 ) {
            System.out.println("FAIL");
        }

    }

}
