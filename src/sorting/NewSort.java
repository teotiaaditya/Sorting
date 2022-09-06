package sorting;

import java.util.*;
public class NewSort {

	public static void main(String[] args) {
		
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the no. of elemments : ");
			int n = sc.nextInt();
			int arr[]= new int[n];
			System.out.println("Enter the elements :-");
			for(int i =0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        } 
			System.out.println("After Selection Sort");  
	        for(int i:arr){  
	            System.out.print(i+" ");
	        }
		}
	}
}

