package binarysearchalgo;

import java.util.Scanner;

public class BinarySearch {
	public static void binarysearch(int[] arr, int first, int last, int key) {
		int mid = (first + last) / 2;

		while (first <= last) {

			if (arr[mid] < key) {
				first = mid + 1;

			} else if (arr[mid] == key) {

				System.out.println("element found at index: " + mid);
				break;

			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("element not found!!!!");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		System.out.println("please enter the integer whose index value you want to check  : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int key = a;
		int last = arr.length - 1;
		binarysearch(arr, 0, last, key);

	}

}
