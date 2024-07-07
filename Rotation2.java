package array;

public class Rotation2 {
    public static void reverse(int arr[],int s,int e) {
    	e--;
    	while(s<=e) {
    		int temp=arr[s];
    		arr[s]=arr[e];
    		arr[e]=temp;
    		s++;
    		e--;
    	}
    }
    public static void RotateRight(int arr[],int n,int x) {
    	reverse(arr,0,n);
    	reverse(arr,0,n-x);
    	reverse(arr,n-x,n);
    }
    public static void RotateLeft(int arr[],int n,int x) {
    	reverse(arr,0,n);
    	reverse(arr,0,x);
    	reverse(arr,x,n);
    }
    public static void RotateArray(int arr[],int n,int x,String dir) {
    	x=x%n;
    	if(x>0 && dir.equals("left")) {
    		RotateLeft(arr,n,x);
    	}else if(x>0 && dir.equals("right") ) {
    		RotateRight(arr,n,x);
    	}
    	for(int i=0;i<n;i++) {
    		System.out.print(arr[i] +" ");
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {1,2,3,7};
//     RotateArray(arr,4,2,"right");
     RotateArray(arr,4,2,"left");
     
     
     
	}

}
