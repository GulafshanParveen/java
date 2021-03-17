class Outer{
        void p1(){
            class Inner{
                void p2(){
                    System.out.println("P2 method");
                }
            }
            Inner i=new Inner();
            i.p2();
        }
}

class MethodMain{
    public static void main(String[] args){
        Outer o=new Outer();
        o.p1();
    }
}