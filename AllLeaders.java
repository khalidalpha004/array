package array;

public class AllLeaders {
    public static void  Leader(int arr[]) {
    	
    	for(int i=0;i<arr.length;i++) {
    	
    		for( int j=i+1;j<arr.length;j++) {
    			if(arr[i]<arr[j]) {
//    				continue;
    				break;
    			}
    			if(j==arr.length-1) {
    				System.out.print(arr[i]+" ");
    			}
    			
    		}
    		
    	}
    	System.out.print(arr[arr.length-1]);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int res[]= {13,17,5,4,6};
         Leader(res);
         
	}

}
