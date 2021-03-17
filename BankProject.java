import java.lang.module.ModuleDescriptor.Modifier;
import java.lang.reflect.*;

class ref{
    public void printer(){
        System.out.println("NEw MEthod");
    }
}

class ReflectionDemo{
    public static void main(String[] args){
        ref m=new ref();
        Class cl=m.getClass();
        Method[] me=cl.getDeclaredMethods();
        int mod=me[0].getModifiers();
	String s1=(Modifier.toString(mod));
        System.out.println(s1);
    }
}
