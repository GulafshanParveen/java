interface A{
    void p();
}
interface B extends A{
    void p2();
}

class MyClass implements A,B{
    public void p(){
        System.out.println("Get method P");
    }
    public void p2(){
        System.out.println("Get method P2");
    }
}
public class InterfaceMode {
    public static void main(String[] args){
        MyClass m=new MyClass();
        m.p();
        m.p2();
        A a=new MyClass();
        a.p();
        B b=new MyClass();
        b.p2();
        }
}
