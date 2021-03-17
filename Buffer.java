class BufferMain{
	public static void main(String[] args){
		StringBuilder sb=new StringBuilder();
		StringBuilder sb1=new StringBuilder("Lucknow");
		StringBuilder sb2=new StringBuilder(10);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		System.out.println(sb1.append(" Junction near Badshah Nagar"));
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		System.out.println();
		StringBuilder s2=new StringBuilder("Lucnow City");
		System.out.println(s2.length());
		System.out.println(s2.capacity());
		//System.out.println(s2.ensureCapacity());
		//System.out.println(s2.reverse());
		//int in=s2.indexOf(s2);
		//String ins=s2.insert(3,'k');
		//System.out.println(in+" "+ins);
	}
}
