import java.lang.reflect.*;

class ref{
    public static void printer(int a,int b)throws Exception{
        System.out.println("New Method");
    }
}

class ReflectionDemo {
    public static void main(String[] args){
	Class cr=ref.class;
        //ref m=new ref();
        //Class cl=m.getClass();
        Method[] me=cr.getDeclaredMethods();
        int mod=me[0].getModifiers();

        String s1=(Modifier.toString(mod));
	String s2=me[0].getName();

	Class op=me[0].getReturnType();
	Class[] p=me[0].getParameterTypes();
	Class[] m=me[0].getExceptionTypes();

	System.out.println("class "+cr.getName()+"{");
 	System.out.print("\t"+s1+" "+op.getName()+" "+s2+" ");
	System.out.print("(");
	System.out.print(p[0].getName()+ ",");
	System.out.print(p[1].getName());
	System.out.print(")");

	System.out.print(" throws");
	System.out.println(" "+m[0].getName());

	System.out.println("}");

    }
}






