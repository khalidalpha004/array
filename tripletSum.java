package array;

public class tripletSum {
	
	public static int sumToX(int arr[],int x) {
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
						temp++;
					}
				}
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,4,5,6,7};
        int res=sumToX(arr,12);
        System.out.println(res);
	}

}
