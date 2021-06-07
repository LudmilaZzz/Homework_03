import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeGenerator {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet cik pirmskaitļus Jūms vajag (no 0 līdz 100): ");
        int size = sc.nextInt(); 
        
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {   
                System.out.print(i + ", "); 
            }           
        } 
    }     
}
