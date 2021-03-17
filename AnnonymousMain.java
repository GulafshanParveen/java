/*interface A{
    void printer();
}*/
class A{
        public void printer(){
            System.out.println("Printer of A");
        }
}

class AnnonymousMain {
    public static void main(String[] args){
        A a=new A(){
            public void printer(){
                System.out.println("Printer Method");
            }
            void p(){
                System.out.println("P method");
            }
        };
        a.printer();
        //a.p();
    }
    
}
