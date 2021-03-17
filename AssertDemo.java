package mypkg.mpkg;

public class AssertDemo{
	public static void main(String[] agrs){
		int x=-10;
		assert x>=0:"x must not be negative";
		double d=Math.sqrt(x);
		System.out.println(d);
	}
}
