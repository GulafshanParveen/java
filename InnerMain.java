class Outer{
        int x;
        Outer(int a){
            x=a;
        }
        class Inner{
            void printer(){
                System.out.println(x);
            }
        }
}

class InnerMain{
    public static void main(String[] args){
        Outer.Inner oi=new Outer(5).new Inner();
        oi.printer();
    }
}
