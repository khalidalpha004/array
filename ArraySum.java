package array;

public class ArraySum {
	public static int ArrayLargest(int arr[]) {
		int n=arr.length;
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(largest<arr[i]) {
				largest=arr[i];
			}
		}
		return largest;
	}
    public static int ArraySum(int arr[]) {
    	int n=arr.length;
    	int sum=0;
    	for(int i=0;i<n;i++) {
    		sum=sum+arr[i];
    	}
    	return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,3,4,5,6,67,89,0};
		int res=ArraySum(arr);
		int largest=ArrayLargest(arr);
		System.out.println(res +" "+largest);

	}

}
