package array;

public class minimumdiffofpairs {
    public static int minimum(int arr1[],int arr2[]) {
    	int m=arr1.length;
    	int n=arr2.length;
    	int result=Integer.MAX_VALUE;
    	for(int i=0;i<m;i++) {
    		for(int j=0;j<n;j++) {
    			if(Math.abs(arr1[i]-arr2[j])<result) {
    				result=Math.abs(arr1[i]-arr2[j]);
    			}
    		}
    	}
    	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr1[]= {1,3,5,4};
         int arr2[]= {9,8,6,2,4};
         int res=minimum(arr1,arr2);
         System.out.println(res);
	}

}
