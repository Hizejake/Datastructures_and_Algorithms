package binary_Search;

public class Ceiling_Of_Number {

	public static void main(String[] args) {
		
		
		int arr[] = {-50, -35, -21, -15, -9, -3, 1, 7, 12, 16, 22, 28, 34, 41, 47, 53, 59, 65, 71, 77};
		int target = 23;
		System.out.println(srch(arr, target,"Ceiling"));
	}
	
	static int srch(int arr[],int ceil,String type) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;

			
			if(ceil < arr[mid]) end = mid-1;
				
			else if(ceil > arr[mid]) start = mid+1;
				
			else return mid;
		}
		
		if(type == "Ceiling") {
			return start;
		}
		else if(type == "Floor") {
			return end;
		}
		
		return -1;
	
	}
}
	
	
