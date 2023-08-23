package binary_Search;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-50, -35, -21, -15, -9, -3, 1, 7, 12, 16, 22, 28, 34, 41, 47, 53, 59, 65, 71, 77};
		int target = 53;
		System.out.println(binarySearch(arr, target));
	}
	
	//return the index
	//return -1 if DNE
	static int binarySearch(int arr[],int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			//find the middle element
			int mid = start + (end-start)/2;
			
			if(target < arr[mid]) end = mid-1;
				
			else if(target > arr[mid]) start = mid+1;
				
			else return mid;
		}
		return -1;
	}

}
