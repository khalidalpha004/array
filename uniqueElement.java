package array;

public class uniqueElement {
	
	public static int unique(int arr[]) {
		int n=arr.length;
//		int temp;
		for(int i=0;i<n;i++) {
		int	temp=0;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					temp++;
				}
				
			}
			for(int k=i+1;k<n;k++) {
				if(arr[i]==arr[k]) {
					temp++;
				}
			}
			if(temp==0) {
				return arr[i];
			}
			
		}
		
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,6,8,9,5,5,7,9};
		int res=unique(arr);
		System.out.println(res);

	}

}
