class Parent{
        /*int a;
        Parent(int x){
                a=x;
                System.out.println("no argument constructor of parent");
        }*/
        void printer(){
                System.out.println("Printer of Parent");
        }
}

class Child extends Parent{
        /*Child(){
                super(5);
                System.out.println("No argument constructor of child");
        }*/
        void printer(){
		System.out.println("Printer of Child");
                super.printer();
        }
}

class IMain{    
        public static void main(String[] args){
                Child c=new Child();
                c.printer();
        }
}



