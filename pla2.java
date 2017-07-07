package gk;
import java.util.*;
public class pla2 {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 int i=0,flag=0,count=0;
	 int n=sc.nextInt();
	 int k=sc.nextInt();
	 for(i=n-k+1; i<=n;i++) {
		 System.out.println(i);
		 }
	 for(i=1;i<n-k+1; i++) {
		 System.out.println(i);
	 }
 }
}
