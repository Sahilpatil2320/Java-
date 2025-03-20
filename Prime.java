import java.util.Scanner;

public class Prime{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
	

		if(isPrime(number)){
				System.out.println(number + " is a prime number.");
			}else {
				System.out.println(number + " is a not prime number.");
		}
		scanner.close();
		
	}
	public static boolean isPrime(int num){
		if(num <= 1) return false;
		for(int i = 2; i *i<= num; i++){
			if(num % i == 0) return false;
		}
		return true;
	}
}

/*
Enter a number: 
67
67 is a prime number.

Enter a number: 
15
15 is a not prime number.
*/
