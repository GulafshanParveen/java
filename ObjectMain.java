class ObjectDemo{
	public String toString(){
		return "Object Demo";
	}
}

class ObjectMain{
	public static void main(String[] args){
		ObjectDemo od=new ObjectDemo();
		System.out.println(od.toString());
		System.out.println(od.hashCode());
	}
}
