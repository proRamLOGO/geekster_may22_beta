import java.util.*;
public class RectangleAreaPerimeter {

    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        
        float l,b;
        l = input.nextFloat();
        b = input.nextFloat();
        
//         System.out.println("Area : ");
//         System.out.println( l*b     ); // AREA
        
//         System.out.println("Perimeter : ");
//         System.out.println( 2*(l+b) ); // PERIMETER
        
        
        System.out.print("Area : ");
        System.out.println( l*b     ); // AREA
        
        System.out.println("Perimeter : " + (2*(l+b)) );
        
    }
    
}











}

