package refPkg;
import java.lang.reflect.*;
class AbstDemo1{
        public int a=0;
        public void display(){}
}

public class AbstDemo{
	public static void main(String[] args){
		AbstDemo1 a=new AbstDemo1();
		Class cl=a.getClass();
		System.out.println(cl);
	}
}
