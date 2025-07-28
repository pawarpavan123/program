package constructors;	
public class Demo {
	
	String name;
	int Employ_id;
	long Employ_no;
	
	 Demo (String name,int Emp_id,long Emp_no){
		this.name=name;
		this.Employ_id=Emp_id;
		this.Employ_no=Emp_no;
		System.out.println(name+" "+ Emp_id+" "+Emp_no);
		
	}
	/*void D () {
		System.out.println(name);
		System.out.println(Employ_id);
		System.out.println(Employ_no);
	}*/

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Demo obj = new Demo ("pawar",101,8308003861l);
		Demo obje = new Demo ("pavan",102,223133l);
		
		
	}

}
