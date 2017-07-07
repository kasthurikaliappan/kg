package gk;
import java.util.*;
public class Repeat {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		char n,m=0;
		int count=0;
		int sum=0;
		for(int i=0;i<s1.length();i++){
			count=1;
			 n=s1.charAt(i);
			for(int j=i+1;j<s1.length();j++){
				if(n==s1.charAt(j)){
					count++;
					
					
				}
				if(count>sum){
					sum=count;
					m=n;
				}
	
			
				
			}
			
			
		}System.out.println("the num  "+m+"  repeated  "+sum+"  times");
		
	}

}

