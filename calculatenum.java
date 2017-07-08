package gk;
import java.util.*;
public class calculatenum {
	  public static void main(String[] args) {
	        Scanner in=new Scanner(System.in);
	        int n,sum=0;
	        n=in.nextInt();
	        for(int i=0;i<n;i++)
	       {
	           sum=sum+i;
	       }
	        sum=sum+n;
	        System.out.println(sum);
	    }
	}

