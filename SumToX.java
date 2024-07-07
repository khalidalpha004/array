package array;

public class SumToX {
    public static int SumToPairs(int arr[],int x) {
    	int temp=0;
    	int n=arr.length;
    	for(int i=0;i<n-1;i++) {
    		for(int j=i+1;j<n;j++) {
    			if(arr[i]+arr[j]==x) {
    				temp++;
    			}
    		}
    	}
    	return temp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,2,3,4,6,-1};
      int res=SumToPairs(arr,5);
      System.out.println(res);
	}

}
