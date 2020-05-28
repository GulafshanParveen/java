import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		//create an object of scanner
		Scanner input=new Scanner(System.in);
		double a,b,c;
		char operator;
		System.out.print("Enter your operator which you want to choose + ,-, / ,*=");
		//ask user to input operator
		operator=input.next().charAt(0);
		System.out.print("Enter number a and b=");
		//ask user to input number
		a=input.nextDouble();
		b=input.nextDouble();
		switch(operator){
				case '+': c=a+b;
					  System.out.println(a + " +" + b + "=" +c);
					  break;
				case '-': c=a-b;
					  System.out.println(a + "-" +b + "=" +c);
					  break;
				case '*': c=a*b;
					  System.out.println(a + "*" + b + "=" +c );
					  break;
				case '/': c=a/b;
					  System.out.println(a + "/" + b + "=" +c);
					  break;
		}
	}
}
