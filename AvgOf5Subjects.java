import java.util.*;
public class AvgOf5Subjects {
    Scanner input = new Scanner(System.in);
        
        int m1, m2, m3, m4, m5;
        m1 = input.nextInt();
        m2 = input.nextInt();
        m3 = input.nextInt();
        m4 = input.nextInt();
        m5 = input.nextInt();
        
        int avg = (m1+m2+m3+m4+m5) / 5;
        
        System.out.println("Average is " + avg + "%.");
}
