package array;

public class negativeandpositivearrangement {
    public static int[] pushpositivetoend(int arr[]) {
    	int n=arr.length;
    	int j=0;
    	for(int i=0;i<n;i++) {
    		if(arr[i]<0) {
    			int temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    			
    			j++;
    		}
    	}
    	return arr;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {-9,1,-2,3,-1};
         int res[]=pushpositivetoend(arr);
         for(int i=0;i<res.length;i++) {
        	 System.out.println(res[i]);
         }
         
	}

}
