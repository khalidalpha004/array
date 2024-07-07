package array;

public class candies {
    public static int[] candy(int a[],int b[],int n,int x) {
    	int carry=0;
    	int ans[]=new int[n];
    	int total=0;
    	for(int i=0;i<n;i++) {
    		total=a[i]+b[i]+carry;
    		carry=0;
    		if(total<=x) {
    			ans[i]=total;
    		}else {
    			carry=total-x;
    			ans[i]=x;
    		}
    	}
    	return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,6,1};
		int b[]= {1,2,1};
		int res[]=candy(a,b,3,6);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}

	}

}
