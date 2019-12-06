package Programs;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		
		//int arr[]=new int[4,7,6,5,7,8,7,2];
		// TODO Auto-generated method stub

		System.out.println("Enter the size of the array");
		int temp=0;

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			
			arr[i]=sc.nextInt();
								
		}
		//System.out.println("Print the array elements" +arr[n-1]);
		
		//find the maximum element by sorting it out first
		
		for(int i=0;i<n;i++){
			for (int j=i+1;j<n;j++){
				
				if(arr[i]>arr[j]){
					
					arr[i]=temp;
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}}
			
		System.out.println("Sorted array is as follows: ");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
			System.out.println("Largest numberof array is "+arr[n-1]);
			System.out.println("Second largest number is "+arr[n-2]);
		
	}

}
