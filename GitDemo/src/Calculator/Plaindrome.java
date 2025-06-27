package Calculator;

import java.util.Scanner;

public class Plaindrome {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter a string");
		try {
		String input=scn.nextLine();
		String reversed ="";
		for(int i=input.length()-1;i>=0;i--)
		{
			reversed =reversed+input.charAt(i);
		}
		if(input.equals(reversed)) {
		System.out.println(input +" is a palindrome");
		}
		else {
			System.out.println(input + "is not plaindorme");
		}
		}
		catch(Exception e) {
			System.out.println("error occured "+ e);
		}
		finally{
			if(scn!=null) {
				scn.close();
			}
		}
		}
	}

	
	
