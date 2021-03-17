import java.util.logging.*;

class LoggingDemo{
	public static void main(String[] args){
		/*Logger.getGlobal().info("My first log");
		Logger mylogger=Logger.getGlobal();
		mylogger.setLevel(Level.WARNING);
		mylogger.info("My first log");
		mylogger.log(Level.WARNING,"Second Log");*/
		Logger mylogger=Logger.getLogger("abc.xyz");
		mylogger.setLevel(Level.WARNING);
		mylogger.warning("This is my first warning");
		Logger mlogger=Logger.getLogger("abc.xyz");
		mlogger.warning("This is second warning");
		if(mylogger==mlogger) System.out.println("Same");
	}
}
