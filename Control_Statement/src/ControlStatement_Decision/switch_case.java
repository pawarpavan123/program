package ControlStatement_Decision;
import java.util.*;
public class switch_case {
public static void main(String[] args) {
	int a=12, b= 20,ch;
	System.out.println("enter ypur choice....");
	Scanner ref = new Scanner(System.in);
	ch= ref.nextInt();
	switch(ch) {
	case 1:System.out.println("sum"+(a+b));
	break;
	case 2:System.out.println("sub"+(a-b));
	break;
	case 3:System.out.println("multi"+(a*b));
	break;
	case 4:System.out.println("div"+(a/b));
	break;
	default:System.out.println("invalid Choice....!");
	}
	
}
}
