package ListAverage;
import java.io.*;
import java.util.*;
class Average {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=0;
		ArrayList<Integer> ob = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			p=s.nextInt();
			ob.add(p);
		}
		float avg=avgList(ob);
		System.out.println(avg);
	}
	static float avgList(ArrayList<Integer> ob)
	{
		float sum=0;
		for(int i:ob)
		{
			sum+=i;
		}
		sum=sum/ob.size();
		return sum;
	}
}
