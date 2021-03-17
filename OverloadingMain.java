class OverloadingDemo{
	int x,y,z;
	OverloadingDemo(){};
	OverloadingDemo(int a){
		x=a;
	}
	OverloadingDemo(int a,int b){
		//x=a;
		this(a);
		y=b;
	}
	OverloadingDemo(int a,int b,int c){
		/*x=a;
		y=b;*/
		this(a,b);
		z=c;
	}
}

class OverloadingMain{
	public static void main(String[] args){
		OverloadingDemo ob=new OverloadingDemo(4,5);
		System.out.println(ob.x+" "+ob.y+" "+ob.z);
	}
}
