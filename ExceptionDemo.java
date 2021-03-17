import java.io.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        File f=new File("/home/gulafsha/Desktop/Kishan ji.pdf");
        try{
            FileInputStream fis=new FileInputStream(f);
            int data;
                while((data=fis.read())!=-1){
                System.out.println((char)data);
                }
            }catch(Throwable t){
                System.out.println("File not found");
            }
        
    }    
}
