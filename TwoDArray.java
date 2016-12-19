public class TwoDArray
{
	public static void main (String[] args)
	{
		int [][] testArr = create2DArray(5);
		print2DArray(testArr);
	}






/**
*This method takes in a 2D-Array and prints the array
*Use two nested loops, one for the rows of the 2-D array, and one for the column
*Overloading --> 
*@return arr[][]
*goes to the next column after every element printed by using the tab character (/t)
*/

	public static void print2DArray (int[][] arr)
	{
		for (int row = 0; row < arr.length; row++)
		{	
			for (int column = 0; column < arr[row].length; column++)
				System.out.print(arr[row][column] + "\t"); 
			System.out.println();
		}
	}

/**
*This method takes in parameter int n and returns a 2-Dimensional array with positive integers increasing from 1 to n*n
*@return int[][] arr
*/
	public static int[][] create2DArray (int n)
	{
		int [][] arr = new int[n][n];

		for (int row = 0; row < n; row++)
		{	
			for (int column = 0; column < n; column++)
				arr[row][column] = (n*row) + column + 1; 
		}
	
		return arr;
	}


}