package linearsearchalgodemo;

import java.util.Scanner;

public class LinearSearch { 
	public static int linearSearch(int[] arr,int key,int size){
		
		for (int i =0; i<size;i++){
			if (arr[i]==key) {
				return i;
				
			}
		
		}
		return -1;
		
	}
	public static void main(String[] args) {
		
		int[]arr= {10,20,30,40,50,60,70,80,90,100};
		int size=arr.length;
		System.out.println("please enter the interger whose index value you want to check  : ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int keyelement=a;
		int position=linearSearch(arr, keyelement, size);
		System.out.println("______________________________");
		 if (position==-1) {
			 System.out.println("the element not found!!!");
		 }
		 else {
			 System.out.println("the element is found: "+keyelement+'\n'+"on the index number: "+position);
		 }
		
		
	}
	
	
	
	
}
