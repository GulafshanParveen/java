import java.io.*;

public class  FileDemo{
	public static void main(String[] args){
		File f1=new File("/home/gulafsha/Downloads/WhatsApp Image 2020-11-05 at 7.04.31 PM.jpeg");
		File f2=new File("/home/gulafsha/Downloads/WhatsApp Image 2020-11-05 at 7.04.31 PM.jpeg");
		try{
			FileInputStream fis=new FileInputStream(f1);
			FileOutputStream fos=new FileOutputStream(f2);
			int b;
			while((b=fis.read())!=-1){
				fos.write(b);
			}
			fos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
