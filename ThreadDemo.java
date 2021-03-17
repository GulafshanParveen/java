//import java.lang.Runnable;
//import java.lang.Thread;

public class ThreadDemo implements Runnable{
	public void run(){
		for(int i=0;i<5000;i++){
			System.out.println(i);
		}
	}
}

class ThreadMain{
	public static void main(String[] args){
		Thread t1=new Thread(new Runnable(){
			public void main(){
				for(int i=0;i<5000;i++){
					System.out.println(i);
				}
			}
		});
		//Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.start();
		t2.start();
	}
}
