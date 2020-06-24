package Start_A;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob2 {

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
		ArrayList<String> ob1=Find(ob);
		for(String ds:ob1)
			System.out.println(ds);
	}
	static java.util.ArrayList<java.lang.String> Find(java.util.ArrayList<java.lang.String> ob) {
		ArrayList<String> obj = new ArrayList<String>();
		for(String i:ob)
		{
			if(i.length()==3 && i.charAt(0)=='a')
				obj.add(i);
		}
		return obj;
	}
}
