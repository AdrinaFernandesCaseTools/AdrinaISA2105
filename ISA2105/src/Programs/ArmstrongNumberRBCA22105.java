package Programs;
import java.util.Scanner;

public class ArmstrongNumberRBCA22105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }

	    public static boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int result = 0;
	        int n = String.valueOf(number).length();
	        
	        while (number != 0) {
	            int remainder = number % 10;
	            result += Math.pow(remainder, n);
	            number /= 10;
	        }
	        
	        return originalNumber == result;
	    }
	

	}


