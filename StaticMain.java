class StaticMain{
	public static void main(String[] args){
		System.out.println("Main Method");
		StaticDemo sb=new StaticDemo();
	}		//without main method it call when it used jdk 1.5 now it will be not done...
}
class StaticDemo{
	static{
		System.out.println("Static Block");
	}
}
