package array;

public class SecondLargestElement {
    public static int secondLargest(int arr[]) {
    	int n=arr.length;
    	int ist=Integer.MIN_VALUE;
    	int second=Integer.MIN_VALUE;
    	
    	for(int j=0;j<n;j++) {
    		if(arr[j]>ist) {
    			ist=arr[j];
    		}
    	    
    		if(arr[j]==ist) {
    			continue;
    		}
    		if(arr[j]>second) {
    			second=arr[j];
    		}
    	}
    	return second;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int arr[]= {1,2,3,4};
           int res=secondLargest(arr);
           System.out.println(res);
	}

}
