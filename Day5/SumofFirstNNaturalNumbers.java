import java.util.*;

public class SumofFirstNNaturalNumbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int sum = 0;
        for ( int i = 1 ; i <= n ; i++ ) {
            sum += i;
            System.out.println(i+" : "+sum);
        }
        System.out.println("------------------------------");
        for ( int i = 1 ; i <= n ; i++ ) {   
            int newSum = (i*(i+1))/2;
            System.out.println(i+" : "+newSum);
        }
        System.out.println("------------------------------");
        for ( int i = 1 ; i <= n ; i++ ) {
            int newSum = 0;
            for ( int j = 1 ; j <= i ; j++ ) {
                newSum += j;
            }
            System.out.println(i+" : "+newSum);
        }
        
    }
}
