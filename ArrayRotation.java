package array;

public class ArrayRotation {
	public static void swap(int a[],int l,int r)
    {
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
    }
    public static void reverse(int []a ,int l,int r)
    {
        r--;
        int len=(r-l)/2;
        for(int i=0;i<=len;i++)
        {
            swap(a,l,r);
            l++;
            r--;
        }
    }
    
    public static void RotateRight(int arr[],int n,int x) {
    	
    	reverse(arr,0,n);
    	reverse(arr,0,x);
    	reverse(arr,x,n);
    	
    	
    }
    public static void RotateLeft(int arr[],int n,int x) {
    	
    	reverse(arr,0,n);
    	reverse(arr,0,n-x);
    	reverse(arr,n-x,n);
    	
    }
//    public static void RotateArray(int arr[],int n,int x,String dir) {
//    	x=x%n;
//    	if(x>0 && dir.equals("LEFT")) {
//    		RotateLeft(arr,n,x);
//    	}else if
//    	(x>0 && dir.equals("RIGHT")) {
//    		RotateRight(arr,n,x);
//    	}
//       for(int i=0;i<n;i++) {
//    	   System.out.println(arr[i]);
//       }
//    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,5,7,3};
		int n=arr.length;
		RotateRight(arr,4,2);
		for(int i=0;i<n;i++) {
	    	   System.out.println(arr[i]);
	       }
	     
	   
	       
	}

}
