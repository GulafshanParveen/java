class NonStatic{
	{
		System.out.println("Non-static block");
	}
	static{
		System.out.println("Static Block");
	}
}
class NonStaticMain(){
	public static void main(String[] agrs){
		NonStatic nd1=new NonStatic();
		NonStatic nd2=new NonStatic();
	}
}
