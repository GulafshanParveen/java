import java.util.*;
public class hash {
    public static void main(String[] args){
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(1,100);
        hm.put(2,200);
        int x=hm.get(1).intValue();
        for(Integer a:hm.keySet()){
            int k=hm.get(a);
            System.out.print(k+ " ");
        }
    }
    
}
