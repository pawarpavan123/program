package constructors;


 class Parameterized {
	 private Parameterized ( int a){
		System.out.println(a);
	}
	 Parameterized (String s){
		
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized obj= new Parameterized (413517);
		Parameterized obje1 =	 new Parameterized ("hii java");
	}

}
