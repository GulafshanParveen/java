interface APIinterface{
	void printer();
}

class Api implements APIinterface{
	public void printer(){
		System.out.println("Printer of API");
	}
}

class Factory{
	public static APIinterface factory(){
	return new Api();
	}
}


class APImain{
        public static void main(String[] args){
                APIinterface ap=Factory.factory();
                ap.printer();
        }
}



