import java.util.Scanner;

public class NameSort{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of names for sorting : ");
		int n = scanner.nextInt();
		scanner.nextLine();

		String[] names = new String[n];

		System.out.println("Enter the names : ");
		for(int i = 0; i < n ; i++){
			names[i] = scanner.nextLine();
		}
	
		//Arrays.sort(name);
		for(int i = 0; i < n; i++){
			for(int j = i+1; j<n; j++){
				if(names[i].compareToIgnoreCase(names[j]) > 0){
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
					//swap(name[i],name[j]);				
				}
			}
		}
		System.out.println("Names in alphabetical order : ");
		for(String name :names){
			System.out.println(name);
		}
		scanner.close();
	}
}

/*
Enter number of names for sorting : 
10
Enter the names : 
sahil
vishal
om
athrav
sahrash
shreyash
prasad
yash
sairaj
nakshatra       
Names in alphabetical order : 
athrav
nakshatra
om
prasad
sahil
sahrash
sairaj
shreyash
vishal
yash
*/
