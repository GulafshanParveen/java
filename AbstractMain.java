abstract class AbstractDemo{
	AbstractDemo(){
		System.out.println("Abstarct Constructor");
	}
	void printer(){
		System.out.println("printer");
	}
	abstract void p();
}

class AChild extends AbstractDemo{
	void p(){
		System.out.println("P method");
	}
}

class  AbstractMain{
	public static void main(String[] args){
		AChild a=new AChild();
		a.printer();
		a.p();
	}
}
