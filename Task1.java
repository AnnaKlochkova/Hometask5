package task1;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 0, 5, 2, 4, 7, 1, 3, 19 };
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] % 2;
			if (a[i] > 0) 
				sum = sum + a[i];{
	}
}
		System.out.print(sum);
}
}