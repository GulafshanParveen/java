class Myclass{
    void printer(float f,int... x){
    System.out.println(f);
        for(int i=0;i<x.length;i++)
            System.out.println(x[i]);
    }
}

public class Ellipsis {
    public static void main(String[] args){
        Myclass my=new Myclass();
        my.printer(2.3f,5,56,4,51,90,11);
    }
    
}
