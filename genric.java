class MyClass{
	public static <T> String getLength(T t){
		return t.toString();
	}
}

class GenricMain{
	public static void main(String[] agrs){
		String k=MyClass.<String>getLength("LUCKNOW");
		//MyClass<Integer>m=new MyClass<Integer>();
		//int k=m.add(2,3);
		//MyClass<MClass>m=new MyClass<MClass>();
		System.out.println(k);
	}
}
