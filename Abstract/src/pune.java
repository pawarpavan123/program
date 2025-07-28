
interface pune_main{
	public void saving ();
	public void carloan();
	public void homeloan();
	public void cards();
	
}
abstract class latur implements pune_main {
	
	 abstract public void saving ();
	 abstract public void carloan ();
	 abstract public void homeloan();
	 abstract public void cards ();
}
public class pune extends latur {
  
	 public void saving () {
		 System.out.println("workar");
	 }
	 public void carloan() {
		 System.out.println(" me ");
	 }
	 public void homeloan () {
		 System.out.println("family ");
	 }
	 public void cards () {
		 System.out.println(" pawar pavan  ");
		 float a= 1212.11321f;
		 System.out.println(a);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pune a1 = new pune ();
		a1.saving();
		a1.carloan();
		a1.homeloan();
		a1.cards();
				
		}

	}


