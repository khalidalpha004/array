package array;

import java.util.Scanner;

public class ArrayBasic {
	
	public static int[] inputArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
		
	}
	
	public static void printArray(int arr[]) {
		System.out.println("Array Elements are");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []arr=new int[10];
//		arr[0]=6;
//		arr[9]=8;
////		arr[0]=10;
//		System.out.println(arr[0]);
//		System.out.println(arr[9]);
//		System.out.println(arr[4]);
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter array size");
//				int n=s.nextInt();
//				int arr[]=new int[n];
//				for(int i=0;i<n;i++) {
//		System.out.println("Enter array elements at " +i);
//					arr[i]=s.nextInt();
//				}
//				int arr1[]=inputArray();
//		System.out.println("Array elements are");
//				for(int i=0;i<arr1.length;i++) {
//					System.out.println(arr1[i]);
//				}
		int arr[]=inputArray();
		printArray(arr);
		
		
	}

}
