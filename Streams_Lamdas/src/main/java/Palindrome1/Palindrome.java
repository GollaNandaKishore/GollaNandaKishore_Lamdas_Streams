package Palindrome1;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String p="";
		ArrayList<String> ob = new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			p=s.next();
			ob.add(p);
		}
		ArrayList<String> ob1=Find_palindrome(ob);
		for(String ds:ob1)
			System.out.println(ds);
	}
	static java.util.ArrayList<java.lang.String> Find_palindrome(java.util.ArrayList<java.lang.String> ob) {
		ArrayList<String> obj = new ArrayList<String>();
		for(String i:ob)
		{
			StringBuilder ab=new StringBuilder(i);
			if((ab.reverse().toString()).equals(i))
			obj.add(ab.reverse().toString());
		}
		return obj;
	}

}
