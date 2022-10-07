package lab;

/*
 * See the link for lab explanation
 * https://docs.google.com/document/d/1QGhcNy-QOFT-J1rOHgeXKv81b5yz0LfEpL_Dl3PPff8/edit#
 * 
 * 
 */

public class ArrayAnalysis {

	
	//#1
	public static int[][] createRandom(int row, int column, int min, int max){
		int[][] arr = new int[row][column];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = (int) (Math.random() * max + min);
			}
		}
		
		return arr;
	}
	
	
	//#2
	public static void printArray(int[][] arr)  {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	
	}
	
	
	//#3
	public static int sumTotal(int[][] arr) {
		
		int sum = 0;
		for(int[] one: arr) {
			
			for (int two : one) {
				
				sum += two;
			}
		}
		
		return sum;
	}
	
	
	//#4
	public static double average(int[][] arr) {
		
		
		
		return sumTotal(arr)/arr.length;
	}
	
	
	//#5
	public static int findMin(int[][] arr) {
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				min = Math.min(min, arr[i][j]);
				
			}
			System.out.println();
		}
		
		return min;
	}
	
	
	//#6
	public static int findMax(int[][] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				max = Math.max(max,  arr[i][j]);
				
			}
			System.out.println();
		}
		
		return max;
	}
	
	
	//#7
	public static int[][] diffArrays(int[][] arr1, int[][] arr2){
		
		int[][] diff = new int[0][0];
		
		if (arr1.length != arr2.length) {
			
		return null;
		}
		else {
			for (int i = 0; i < arr1.length; i++) {
				
				for (int j = 0; j < arr1[i].length; j++) {
					
					int differ = arr1[1][j] - arr2[2][j];
					
					diff[i][j] = differ;
				}
				}
		}
		
		return diff;
	}
	
	
	//#8
	public static int[][] transposeRow(int[][] arr1, int dist){
		
		int[] First = arr1[0];
		int[] Last = arr1[arr1.length - 1];
		
		for (int count = 0; count < dist; count++) {
			
		
		for (int i = 1; i < arr1.length; i++) {
			for(int[] row : arr1) {
				
				arr1[i] = row;
			}
		}
		}
		
		return null;
	}
	
	
	//#9
	public static int sum3D(int[][][] arr) {
		
		int work = 0;
		
		for (int[][] one : arr) {
			work += sumTotal(one);
		}
		return work;
	}
	
	
	//#10
	public static double average3D(int[][][] arr) {
		
		
		return 0;
	}
	
	
	
	
	
	
}
