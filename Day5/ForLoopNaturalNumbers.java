import java.util.*;

public class ForLoopNaturalNumbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // q. print natural numbers till n using for loop.
        
        int n = input.nextInt();
        
        for ( int num = 0 ; num < n ; num++ ) {
            System.out.println(num+1);
        }
        
        System.out.println("n = " + n);
        // System.out.println("num = " + num); // ERROR
        
    }
}
