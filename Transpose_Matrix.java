import java.util.Scanner;
class Transpose_Matrix 
{
    	public static void main(String[] args) 
	{
        	int row, column,n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of Rows and Columns");
		row = sc.nextInt();
		column = sc.nextInt();

		int[][] matrix = new int[row][column];
		
		System.out.println("Enter "+row*column+" values : ");
		for(int i = 0; i < row; i++) 
		{
            		for (int j = 0; j < column; j++) 
			{
                		matrix[i][j]=sc.nextInt();
            		}
        	}			
	
		System.out.println("\nOriginal matrix is: ");
        	display(matrix);

        	int[][] transpose = new int[column][row];
        	for(int i = 0; i < row; i++) 
		{
            		for (int j = 0; j < column; j++) 
			{
                		transpose[j][i] = matrix[i][j];
            		}
        	}

		System.out.println("\nTranspose matrix is: ");	
        	display(transpose);
    	}

    	public static void display(int[][] matrix) 
	{
        	for(int[] row : matrix) 
		{
            		for (int column : row) 
			{
                		System.out.print(column + "    ");
            		}
            		System.out.println();
        	}
    	}
}