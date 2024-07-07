package array;

public class IntersectionofArrays {
    public static void intersection(int arr1[],int arr2[]) {
    	int n=arr1.length;
    	int m=arr2.length;
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			if(arr1[i]==arr2[j]) {
    				System.out.println(arr1[i]);
    				arr2[j]=-1;
    				break;
    			}
    		}
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {2,6,1,2};
		int arr2[]= {1,2,3,4,2};
		intersection(arr1,arr2);
		

	}

}
