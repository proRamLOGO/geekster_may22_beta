import java.util.*;

public class VoterEligibility {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            
        // METHOD 0
        int age = input.nextInt();
        System.out.println(age>=18);
        System.out.println("true -> ELIGIBLE");
        System.out.println("false -> NOT ELIGIBLE");
        
        // METHOD 1
        age = input.nextInt();
        if ( age >= 18 ) {
            System.out.println("ELIGIBLE");
        }
        else {
            System.out.println("NOT ELIGIBLE");
        }


        // METHOD 2
        age = input.nextInt();
        if ( age < 18 ) {
            System.out.print("NOT ");
        }
        System.out.println("ELIGIBLE");

    }
// 12            
// NOT ELIGIBLE        


// 23
// ELIGIBLE       

    
}
