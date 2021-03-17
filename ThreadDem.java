class ThreadDem extends Thread{
	public void run(){
		for(int i=0;i<5000;i++){
			System.out.println(i);
		}
	}
}


class ThreadMain{
	public static void main(String[] args){
		Thread t1=new ThreadDem();
		t1.start();
	}
}
