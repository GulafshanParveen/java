import java.util.Scanner;

public class ExceptionDemmo {
    public static void main(String[] args){
        int x=0,y=0,z=0;
        System.out.println("Enter two number with space:");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String [] ip=input.split(" ");

        x=Integer.parseInt(ip[0]);
        y=Integer.parseInt(ip[1]);

        try{
             z=x/y;
        }catch(ArithmeticException ae){
            System.out.println("2nd value could not be zero");
            y=sc.nextInt();
            z=x/y;
            //ae.printStackTrace();
        }

        System.out.println(z);
    }    
}
