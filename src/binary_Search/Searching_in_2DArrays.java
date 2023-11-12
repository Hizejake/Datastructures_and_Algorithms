package binary_Search;

import java.util.*;

public class Searching_in_2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{-15, -10, -5, 0, 5},
			    {-12, -7, -2, 3, 8},
			    {-9, -4, 1, 6, 11},
			    {-6, -1, 4, 9, 14},
			    {-3, 2, 7, 12, 17}
			};
		int target = 4;

		System.out.println(Arrays.toString(search(arr, target)));
	}
	static int[] search(int arr [][],int target) {
		int row = 0;
		int col = arr.length-1;
		
		while (row<arr.length && col>0) {
			if(arr[row][col] == target) return new int[] {row,col};
			if(arr[row][col] < target) row ++;
			else col --;
		}
		return new int[] {-1,-1};
	}
}
