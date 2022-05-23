import java.util.*;
public class DoWhile {
    public static void main(String[] args) {
        
        // Q. to print all natural nums till 0.
        
        int num = 0;
        while ( num < 0 ) {
            System.out.println(num+1);
            num = num + 1;
        }
        System.out.println("----------------------------");
        
        num = 0;
        do {
            System.out.println(num+1);
            num++;
        } while ( num<0 );
        // } while ( num<10 );
        // } while ( num<=9 );
        
        
    }
}