package gk;
import java.util.*;
public class pla1 {
 public static void main(String args[]) {
	 Scanner s=new Scanner(System.in);
	 String day=s.next();
	 char c=day.charAt(1);
	 if(c == 'u') {
		 System.out.println("holiday");
	 }
	 else {
		 System.out.println("workingday");
	 }
 }
}
