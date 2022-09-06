package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements :-");
		int n = sc.nextInt();
		int arr[]=new int[n];
		int temp;
		System.out.println("Enter the elements :-");
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();			
		}
		for(int j=0; j<n; j++) {
		for(int i=0; i<n-1; i++) {
			if(arr[i]> arr[i+1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
		}
		}
	}
		System.out.println("Sorted array is :-");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i] + " ");
			
		}
	}
}
