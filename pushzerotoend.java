package array;

public class pushzerotoend {
	public static int[] pushzeroend(int arr[]) {
		int n=arr.length;
		int i=0;
		int j=0;
		while(i<n) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j++;
				
			}
			else {
			i++;
			}
		}
		
		
		return arr;
		
	}
//    public static int[] pushzero(int arr[]) {
//    	int n=arr.length;
//    	
//    	int arr1[]=new int[n];
//    	int i=0;
//    	int j=0;
//    	while(i<n) {
//    		
//    		while(j<n) {
//    			if(arr[i]!=0) {
//    				arr1[j]=arr[i];
//    				i++;
//    				j++;
//    				break;
//    			}else {
//    				i++;
//    			}
//    		
//    		}
//    	}
//    	return arr1;
//    	
//    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,0,6,0,0,8,0};
		int res[]=pushzeroend(arr);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}

	}

}
