//package mypkg;
import java.util.HashMap;


class Factory{
	static HashMap<String,Object> hm=new HashMap<>();
	synchronized public static Object getInstance(String s)throws Exception{
		Object o=hm.get(s);
		if(o!=null)
			return 0;
		else{
			Class cl=Class.forName(s);
			o=cl.newInstance();
			hm.put(s,o);


		}
		return o;
	}
}

class FactoryG{
	public static void main(String[] args){
		try{
			String s=(String)Factory.getInstance("java.lang.String");
			FactoryG a=(FactoryG)Factory.getInstance("mypkg.FactoryG");
		}catch(Exception e){
	        e.printStackTrace();
        }
	}
}

