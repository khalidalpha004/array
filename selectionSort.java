package array;

public class selectionSort {
    public static void SelectionSort(int arr[]) {
    	int n=arr.length;
//    	int  min=0;
    	for(int i=0;i<n-1;i++) {
    		int min=Integer.MAX_VALUE;
    		int k=-1;
        for(int j=i;j<n;j++) {
        	if(arr[j]<min) {
        		min=arr[j];
        		k=j;
        	}
           }
        int temp=arr[k];
        arr[k]=arr[i];
        arr[i]=temp;
    	}
//    		return arr;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {6,5,7,3,4,1};
      SelectionSort(arr);
       for(int i=0;i<arr.length;i++) {
    	   System.out.println(arr[i]);
       }
	}

}
