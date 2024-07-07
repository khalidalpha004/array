package array;

public class sort0and1Array {
	
	  public static void sort(int arr[]) {
		  int n=arr.length;
		  int temp=0;
		  for(int i=0;i<n;i++) {
			  if(arr[i]==0) {
				  temp++;
			  }
		  }
		  for(int i=0;i<temp;i++ ) {
			  arr[i]=0;
		  }
		  for(int i=temp;i<n;i++) {
			  arr[i]=1;
		  }
		  for(int i=0;i<n;i++) {
			  System.out.println(arr[i]);
		  }
	  }
	  
	  
//    public static int[] sort(int arr[]) {
//    	int n=arr.length;
//    	for(int i=0;i<n-1;i++) {
//    		for(int j=i+1;j<n;j++) {
//    		if(arr[i]==1) {
//    			int temp=arr[i];
//    			arr[i]=arr[j];
//    			arr[j]=temp;
//    		}
//    	}
//    	}
//    	return arr;
//    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,1,0,1,0,1};
		sort(arr);
//		for(int i=0;i<res.length;i++) {
//			System.out.println(res[i]);
//		}

	}

}
