package array;

public class SwapArrayelements {
    public static void swapPair(int arr[]) {
    	int n=arr.length;
    	for(int i=0;i<n-1;i=i+2) {
    		int temp=arr[i];
    		arr[i]=arr[i+1];
    		arr[i+1]=temp;
    		
    	}
    	
    	for(int i=0;i<n;i++) {
    		System.out.println(arr[i]);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {1,2,3,4,5};
     swapPair(arr);
	}

}
