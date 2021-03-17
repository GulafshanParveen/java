import java.lang.reflect.Method;

class MyClass{
	int add(int x,int y){
		return x+y;
	}
}

class FactoryM{
	public static void main(String[] args)throws Exception{
		try{
			Class cl=MyClass.class;
			Method m=cl.getMethod("add",int.class,int.class);
			int x=20,y=30;
			Integer i=(Integer)m.invoke(x,y);
			System.out.println(i);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
