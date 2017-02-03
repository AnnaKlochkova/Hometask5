package task4;

import java.util.Arrays;
import java.util.Scanner;

import javax.xml.soap.Text;

public class Task4 {

	public static <string> void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		String s = scan.nextLine();
		int b=0;
		for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i) == 'b') 
                 b= b+1;
        }
		System.out.println("b= "+b);
			}
	}
	



