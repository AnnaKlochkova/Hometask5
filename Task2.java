package task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	private static Object sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int mas;
			System.out.print("Enter the number of array elements: ");
			mas = sc.nextInt();
			int[] a = new int[mas];
			for (int i = 0; i < mas; i++) {
				System.out.print("Enter elements: ");
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < a.length; i++) {
				
			}
			System.out.println(Arrays.toString(a));
		}

	}