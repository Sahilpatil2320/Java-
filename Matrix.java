public class Matrix{
	public static void main(String [] args){
		int [] [] matrix = {{1,2} , {4,3}};
	
		System.out.println("The 2x2 matrix is : ");
		for(int i=0; i < 2 ; i++){
			for(int j=0; j < 2; j++){
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}	
	}
}

/*
The 2x2 matrix is : 
1 2 
4 3 
*/
