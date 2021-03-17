class Outer{
    int x;
    Outer(int a){
        x=a;
    }
    static class Inner{
        void printer(){
            Outer o=new Outer(10);
            System.out.println(o.x);
        }
    }
}

class NestedMain{
    public static void main(String[] args){
        Outer.Inner oi=new Outer.Inner();
        oi.printer();
    }
}
