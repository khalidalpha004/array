package array;

public class sort02and1inArray {
    public static void sort012(int arr[]) {
    	int n=arr.length;
    	int count=0,temp=0;
    	for(int i=0;i<n;i++) {
    		if(arr[i]==0) {
    			count++;
    		}
    		if(arr[i]==1) {
    			temp++;
    		}
    	}
    	for(int i=0;i<count;i++) {
    		arr[i]=0;
    	}
    	for(int i=count;i<count+temp;i++) {
    		arr[i]=1;
    	}
    	for(int i=count+temp;i<n;i++) {
    		arr[i]=2;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,0,2,1,2};
		sort012(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
