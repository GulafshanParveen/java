import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*String input=sc.nextLine();
        Scanner in = new Scanner(System.in); 
        System.out.println("You entered string " + input); 
        int a = in.nextInt(); 
        System.out.println("You entered integer " + a); 
        float b = in.nextFloat(); 
        System.out.println("You entered float " + b); */


        String input=sc.nextLine();
        String[] ip=input.split(" ");
        
        for(int i=0;i<ip.length;i++){
            int x=Integer.parseInt(ip[i]);
            System.out.println(x);
        }
    }    
}
