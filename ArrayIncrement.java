package array;

public class ArrayIncrement {
    public static int[] incrementArray(int input[]) {
    	
//    	System.out.println(input);
    	input=new int[5];
    	System.out.println(input);
    	for(int i=0;i<input.length;i++) {
    		input[i]=input[i]+1;
    	}
    	return input;
    }
    public static void PrintArray(int arr[]) {
    	for(int i=0;i<arr.length;i++) {
    		System.out.println(arr[i]);
    		
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		System.out.println(arr);
	   int res []= incrementArray(arr);
      PrintArray(res);
	}

}
