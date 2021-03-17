class MyClass{
	private MyCLass(){}
	void printer(){
		System.out.println("Hello");
	}
	public static Myclass factory(){
		MyClass m=new MyClass();
		return m;
	}
}

class FactoryMain{
	public static void main(String[] args){
		MyClass m1=Myclass.factory();
		m1.printer();
	}
}
