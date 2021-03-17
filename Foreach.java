import java.util.ArrayList;

class Foreach{
	public static void main(String[] args){
		ArrayList<Integer> ai=new ArrayList<>();
		ai.add(34);
		ai.add(10);
		ai.add(20);
		for(Integer i:ai){
			System.out.println(i);
		}
	}
}
