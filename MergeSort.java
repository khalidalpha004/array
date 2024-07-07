package array;

public class MergeSort {
    public static int[] Mergesort(int arr1[],int arr2[]) {
    	int m=arr1.length;
    	int n=arr2.length;
    	int arr3[]=new int[m+n];
    	int i=0,j=0,k=0;
    	while(i<m&&j<n) {
    		if(arr1[i]<=arr2[j]) {
    			arr3[k]=arr1[i];
    			i++;
    			k++;
    		}else {
    			arr3[k]=arr2[j];
    			j++;
    			k++;
    		}
    	}
    	while(i<m) {
    		arr3[k]=arr1[i];
			i++;
			k++;
    	}
    	
    	while(j<n) {
    		arr3[k]=arr2[j];
			j++;
			k++;
    	}
    	return arr3;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,6,7,8};
		int arr2 []= {2,3,4};
		
		int arr3[]=Mergesort(arr1,arr2);
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		

	}

}
