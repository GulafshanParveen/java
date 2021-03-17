final class Parent{
    public final void p() {
        System.out.println("P method");
    }
}
class Child extends Parent{
    public void p(){
        System.out.println("P Of Child");
    }
}

class PCMain {
    public static void main(String[] args){
        Child c=new Child();
        c.p();
    }
}
