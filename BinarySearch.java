package array;

public class BinarySearch {
    public static int Binarysearch(int arr[],int x) {
    	int n=arr.length;
    	int s=0;
    	int e=n-1;
    	int mid;
    	while(s<=e) {
    		 mid=(s+e)/2;
    		if(arr[mid]<x) {
    			s=mid+1;
    		}else if(arr[mid]>x) {
    			e=mid-1;
    		}else {
    			return mid;
    		}
    		
    	}
    	return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,2,3,6,4,7,};
      int res=Binarysearch(arr,7);
      System.out.println(res);
      
	}

}
