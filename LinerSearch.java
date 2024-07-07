package array;

import java.util.Scanner;

public class LinerSearch {
	
	public static int[] ArrayInput() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static int LinerSearch(int arr[],int n) {
		
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				return i;
			}
		}
		return -1;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner s=new Scanner(System.in);
     int arr[]=ArrayInput();
     System.out.println("enter element to search");
     int n=s.nextInt();
     int res=LinerSearch(arr,n);
     
     System.out.println(res);
	}

}
