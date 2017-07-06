package gk;
import java.util.Scanner;
public class integer {
 public static void main(String args[]) {
	 int i,count=0;
	 Scanner s=new Scanner (System.in);
	 int n=s.nextInt();
	
	 for(i=0; i<n; i++) {
		 int[] a = null;
		a[i]=s.nextInt();
		 count=count^a[i];
	 }
	 System.out.println(count);
 }
}
