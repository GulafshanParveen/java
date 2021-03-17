class ParentClass{
	private void p1(){
	System.out.println("P1");
	}

	public void p2(){
	System.out.println("P2");
	}

}

class ChildClass extends ParentClass{
	public 	void p2(){
	System.out.println("ChildClass Accessible");
	}
}

class FactoryMethod{
	public static ParentClass factory(){
		return (new ParentClass());
	}
}

class Inherit{
	public static void main(String[] args){
		/*ParentClass p=new ParentClass();
		p.p2();
		ParentClass ch=new ChildClass();
		ch.p2();
		ch.p3();*/
	//	ParentClass c=FactoryMethod.factory();
		ChildClass c=(ChildClass)(new ParentClass());
		c.p2();
	}
}
