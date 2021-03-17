class OverloadingDemo{
	void printer(){
		int x;
		x=20;//if not intialized it caused error
		System.out.println(x);
	}
}

class DataCons{
	public static void main(String[] args){
		OverloadingDemo ab=new OverloadingDemo();
		ab.printer();
	}
}
