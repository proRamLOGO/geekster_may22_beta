// "static void main" must be defined in a public class.

import java.util.*;
public class Input_Ouptput_Variables {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        
        
        System.out.println( "Hello" );
        System.out.println( 34 );
        System.out.println( "34" );
        System.out.println( 'a' );
        
        int x, y;
        x = 89;
        System.out.println( x );
        
        // x = "hello"; // CANT DO THIS
        // System.out.println( x );
        
        x = 43+5-6;
        System.out.println( x );
        
        y = x;
        System.out.println( y );
        
        y = x+34;
        System.out.println( y );
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        int num1;
        num1 = input.nextInt();
        System.out.println( num1 ); // variable
        System.out.println("num1"); // string/constant
        
        float num2;
        num2 = input.nextFloat();
        System.out.println( num2 ); 
        
        String s;
        s = input.next();
        System.out.println( s );
        
        
    }
    
}









