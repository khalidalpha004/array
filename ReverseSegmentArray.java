package array;

public class ReverseSegmentArray {
    public static void Reverse(int arr[],int s,int e) {
    	int i=s;
    	int j=e;
    	while(i<=j) {
    		int temp=arr[i];
    		arr[i]=arr[j];
    		arr[j]=temp;
    		i++;
    		j--;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {1,2,3,4,5,6,7};
     Reverse(arr,1,4);
     for(int i=0;i<arr.length;i++) {
    	 System.out.println(arr[i]);
     }
	}

}
