package gk;
import java.util.*;
public class maximum {
public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.print("[");
		for(int i=1;i<=3;i++)
		{
			System.out.print(a[n-i]+",");
		}
		System.out.print("]");
		

	}

}

