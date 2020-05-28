import java.util.Scanner;
	class AllInput{
		public static void main(String[] args){
			//input for integer
			Scanner input=new Scanner(System.in);
			System.out.println("Enter an integer=");
			int num=input.nextInt();
			//input from user
			System.out.println("You entered=" + num);
			//input for float
			System.out.println("Enter float=");
			float a=input.nextFloat();
			System.out.println("You entered=" + a);
			//input for double
			System.out.println("Enter double=");
			double b=input.nextDouble();
			System.out.println("You Entered=" +b);
			//input for string
			System.out.println("Enter String=");
			String c=input.next();
			System.out.println("You entered=" +c);
		}
}
