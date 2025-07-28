package percentage;

public class type2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Math = 120;
int Eng = 120;
int A = 120;

double total = Math+Eng+A;
double perc = total/400*100;
//System.out.println("total "+300);
//System.out.println(total);
//System.out.println(perc);
if (perc>35&&perc<50) {
	System.out.println("pass with grade c");
	System.out.println("total "+300);
	System.out.println(total);
	System.out.println(perc);
}
else if(perc>50&&perc<60) {
	System.out.println("pass with grade B");
	System.out.println("total "+300);
	System.out.println(total);
	System.out.println(perc);
}
else if(perc>60&&perc<70) {
	System.out.println("pass with grade A");
	System.out.println("total "+300);
	System.out.println(total);
	System.out.println(perc);
}
else if(perc>70&&perc<100) {
	System.out.println("pass with grade A+");
	System.out.println("total "+300);
	System.out.println(total);
	System.out.println(perc);
	
}
else if (perc<35&&perc>0) {
	System.out.println("fail");
}
else {
	System.out.println("enter valid marks");
}
	}

}
