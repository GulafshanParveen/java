import java.util.*;
public class GenericArray {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(30);
        al.add(40);
        for(Integer a:al) System.out.print(a+" ");
        //Object obj=al.get(0);
        //System.out.println(obj);
        int x=al.get(0);
        Integer y=al.get(0);
        //Integer i=((Integer)al.get(0)).intValue();
        System.out.println(y+ " " +x);
    }
}
