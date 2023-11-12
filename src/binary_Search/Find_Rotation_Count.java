package binary_Search;

public class Find_Rotation_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15, 18, 2, 3, 6, 12};
		System.out.println(count_Rotation(arr));
	}
	
	static int count_Rotation(int arr[]) {		
		return finding_pivot(arr)+1;
	}
	
	static int finding_pivot(int arr[]) {
		int start = 0;
		int end = arr.length;
		
		while(start<end) {
			int mid = start + (end - start)/2;

			if(mid<end && arr[mid]>arr[mid+1]) return mid;
			if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
			if(arr[mid]<arr[start]) end = mid-1;
			else start = mid+1;
		}
		
		return -1;
	}
}
