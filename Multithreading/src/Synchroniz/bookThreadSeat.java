package Synchroniz;
 class bookThreadSeat {
	int total_seats=10;
	void bookSeat(int seats) {
	//	System.out.println("jghgkj");
		synchronized (this){
		if(total_seats>=seats) {
			System.out.println(seats+"seats books successfully ");
			total_seats=total_seats-seats;
			System.out.println("seat left : "+total_seats);	
		}
		else {
			System.out.println("sorry seat cannot be booked.....!");
			System.out.println("seat left : "+total_seats);
	}
	}//System.out.println("jgj");
	}}
	 class Synchronization extends Thread {
		static bookThreadSeat pawar;
		int seat ;
		private int seats;
		public void run () {
//			int seats = 0;
			pawar.bookSeat(seats);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bookThreadSeat pawar = new bookThreadSeat();
      Synchronization obj = new Synchronization();
      obj.seats=7;
     obj.start();
     Synchronization pavan = new Synchronization();
      pavan.seats=6;
      pavan.start();
	}
}