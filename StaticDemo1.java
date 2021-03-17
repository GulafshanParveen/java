class StaticMain1{
        public static void main(String[] args){
                System.out.println("Main Method");
                StaticDemo1 sb=StaticDemo1().factory();
		sb.printer();
        }               //without main method it call when it used jdk 1.5 now it will be not done...
}
class StaticDemo1{
	private StaticDemo1();
	private static StaticDemo1 sb;
	static{
		sb=new StaticDemo1();
	}
	static StaticDemo1 factory(){
		return sb;
	}
        void printer(){
                System.out.println("Printer");
        }
}



