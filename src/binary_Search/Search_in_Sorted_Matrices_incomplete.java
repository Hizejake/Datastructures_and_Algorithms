package binary_Search;

public class Search_in_Sorted_Matrices_incomplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	// search in the rows between the columns provided.
	static int[] binarySearch(int[][] arr, int row,int col_start, int col_end,int target) {
		while(col_start<col_end) {
			int mid = col_start + (col_end-col_start)/2;
			if(arr[row][mid] == target)
				return new int[] {row,mid};
			if(arr[row][mid] < target)
				col_start = mid+1;
			else
				col_end = mid-1;
		}
		return new int[] {-1,-1};
	}
	
	static int[] search (int[][] arr,int target) {
		
		int rows = arr.length;
		int col = arr[0].length;
		
		if(rows == 1)
			return binarySearch(arr, 0, 0, col-1, target);
		
		int row_start = 0;
		int row_end = rows -1;
		int col_mid = col/2; 
		//run the loop till two rows are remaining.
		
		while(row_start<(row_end - 1)) {
			int mid = row_start + (row_end - row_start)/2;
			
			if(arr[mid][col_mid] == target)
				return new int[] {mid,col_mid};
			if(arr[mid][col_mid] < target)
				row_start = mid;
			else
				row_end = mid;
			
			//now we only have two rows
			//check weather the target is in the col of 2 rows
			
			if(arr[row_start][col_mid]==target)
				return new int[] {row_start,col_mid};
			
			if(arr[row_start+1][col_mid]==target)
				return new int[] {row_start+1,col_mid};
			
			/* search in 1st half
			 * search in 2nd half
			 * search in 3rd half
			 * search in 4th half*/
			
		}
		
		return new int[] {-1,-1};
	}

}
