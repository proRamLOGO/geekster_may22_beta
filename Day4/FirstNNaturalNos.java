import java.util.*;

public class FirstNNaturalNos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        
        int n = input.nextInt();
        int num = 1;
        while ( num <= n ) {
            System.out.println(num);
            num = num + 1;
        }
        
        System.out.println("----------------------------");
        
        num = 0;
        while ( num < n ) {
            System.out.println(num+1);
            num = num + 1;
        }
        
    }
}