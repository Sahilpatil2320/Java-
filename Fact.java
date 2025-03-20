class Fact{
	public static void main(String[]args){
		int a = 5;
		int fact = 1;

		for(int i = 1; i<=a; i++){
			fact = fact * i;
		}
		System.out.printf("Factorial of 5 is: "+fact);
		System.out.println();
	}
}

/*
Factorial of 5 is: 120
*/
