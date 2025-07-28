 
abstract class sbi{  
  
  abstract void run();
}
class kotak extends sbi

{  
	void run()
	{
		System.out.println(1);
		
	}}
	class baroda extends sbi {
		void run() {
			System.out.println(11);
		}
	}
	class rbi extends sbi {
		void run () {
			System.out.println(111);
		}
	void run1 () {
		System.out.println(12342443);
	}
public static void main(String []args){  
  
 //obj.run();  
 kotak a = new kotak();
 a.run();
 a.run();
 
 baroda a1 = new baroda();
 a1.run();
 rbi a2 = new rbi ();
 a2.run();
 a2.run1();
 }  
}
