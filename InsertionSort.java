package array;

public class InsertionSort {
    public static void insertionSort(int arr[]) {
    	int n=arr.length;
    	for(int i=1;i<n;i++) {
    		int temp=arr[i];
    		int j=i-1;
    		while(j>=0 && arr[j]>temp) {
    			arr[j+1]=arr[j];
    			j--;
    		}
    		arr[j+1]=temp;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,2,6,9,3};
		insertionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
