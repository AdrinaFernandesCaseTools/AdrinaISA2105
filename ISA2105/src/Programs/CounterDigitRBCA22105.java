package Programs;
import java.util.Scanner;

public class CounterDigitRBCA22105 {
	
		public int countDigits(int number) {
	        if (number == 0)
	            return 1;
	        
	        int count = 0;
	        while (number != 0) {
	            number /= 10;
	            count++;
	        }
	        return count;
	    
	}
	
}
