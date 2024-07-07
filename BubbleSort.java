package array;

public class BubbleSort {
	public static void Bubblesort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,2,6,9,3};
		Bubblesort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
