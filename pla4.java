package gk;
import java.util.*;
public class pla4 {
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		System.out.println("enter the string");
		String s=in.nextLine();
		String res;
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String s1=sb.toString();
		System.out.println(s1);
		 res = s1.replaceAll("[aeiouAEIOU]", "");
		  System.out.println(res);  
	 
	}
	}

