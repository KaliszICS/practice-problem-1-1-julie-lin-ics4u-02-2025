public class PracticeProblem {

	public static int sum2D(int[][] arr){
		int sum = 0; 
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				sum += arr[i][j];
			}
		}
		return sum; 
	}
		//Write question 2 code here
	public static int sumRow (int[][] arr, int row ){
		int sum = 0; 
		for (int col = 0; col < arr[row].length; col++){
			sum += arr[row][col];
		}
		return sum; 
	}

		//Write question 3 code here
	public static int sumColumn (int[][] arr, int col ){
		int sum = 0; 
		for (int row = 0; row < arr.length; row++){
			sum += arr[row][col];
		}
		return sum; 
	}

}
