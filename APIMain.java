interface APIinterface{
	void printer();
}

class APIClass{
	void m(APIinterface is){
			is.printer();
	}
}

class Factory{
	public static APIClass factory(){
		return new APIClass();
	}
}
class MyClass implements APIinterface{
	public void printer(){
		System.out.println("Printer Methods");
	}
}

class APIMain{
	public static void main(String[] args){
		APIClass ap=Factory.factory();
		ap.m(new MyClass());
	}
}
