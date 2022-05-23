// "static void main" must be defined in a public class.
import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for ( int row = 1 ; row <= n ; row++ ) {
            
            for ( int cnt = 0 ; cnt < row ; cnt++ ) {
                
                System.out.print("* ");    
                
            }
            
            System.out.println();
            
        }
        
    }
}