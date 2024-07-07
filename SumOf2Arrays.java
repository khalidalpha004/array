package array;

public class SumOf2Arrays {
    public static int[]sum(int arr1[],int arr2[]){
    	int i=arr1.length-1;
    	int j=arr2.length-1;
    	int k=Math.max(i+1,j+1);
    	int carry=0;
    	int sum=0;
    	int arr3[]=new int[k+1];
    	while(i>=0 && j>=0) {
    		 sum=arr1[i]+arr2[j]+carry;
    		arr3[k]=sum%10;
    		 carry=sum/10;
    		 i--;
    		 j--;
    		 k--;
    	}
    	while(i>=0) {
    	  sum=arr1[i]+carry;
    		arr3[k]=sum%10;
    		carry=sum/10;
    		 i--;
    		 k--;
    	}
    	
    	while(j>=0) {
    		 sum=arr2[j]+carry;
    		arr3[k]=sum/10;
    		 carry=sum%10;
    		 k--;
    		 j--;
    	}
    	if(carry>0) {
    	arr3[0]=carry;
    	}
    	return arr3;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr1[]= {9,2,3,7};
       int arr2[]= {9,1,2,3};
       int res[]=sum(arr1,arr2);
       for(int i=0;i<res.length;i++) {
    	   System.out.println(res[i]);
       }
       
	}

}
