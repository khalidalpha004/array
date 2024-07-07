package array;

public class printPairs {
	
	
    public static void PrintPairs(int arr[]) {
    	int n=arr.length;
    	for(int i=0;i<n-1;i++) {
    		for(int j=i+1;j<n;j++) {
    			System.out.println("(" +arr[i]+ "," +arr[j]+")");
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		PrintPairs(arr);

	}

}
