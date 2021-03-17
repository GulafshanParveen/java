import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args){
        ArrayList al=new ArrayList();
        al.add(2);
        al.add("Gulafsha khan");
        al.add(3.2f);
        //int x=al.add(0); error occured because primitive can't convert into non-primitive.
        int x=((Integer)al.get(0)).Object intValue();
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }
}
