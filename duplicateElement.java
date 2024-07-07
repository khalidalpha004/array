package array;

public class duplicateElement {
	
	public static int duplicate(int arr[]) {
		int n=arr.length;
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
				if(temp==1) {
					return arr[i];
				}
				
			}
			
			
			return -1;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,4};
		int res=duplicate(arr);
		System.out.println(res);
		

	}

}
