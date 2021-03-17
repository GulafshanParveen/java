interface MyInterface{
	int x=10;
	void printer();
}

class InterfaceDemo implements MyInterface{
	public void printer(){
		System.out.println("Printer Method");
	}
	void p(){
	System.out.println("P method");
	}
}

class InterfaceMain{
	public static void main(String[] args){
		MyInterface id=new InterfaceDemo();
		id.printer();
		id.p();
//		System.out.println(MyInterface.x);
	}
}
