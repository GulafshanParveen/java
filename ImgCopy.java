import java.io.*;

class  FileDemo{
        public static void main(String[] args){
                File f1=new File("/home/gulafsha/Downloads/WhatsApp Image 2020-11-05 at 7.04.31 PM.jpeg");
                File f2=new File("/home/gulafsha/Downloads/WhatsApp Image 2020-11-05 at 7.04.31 PM.jpeg");
                try{
			FileInputStream fis=new FileInputStream(f1);
                        FileOutputStream fos=new FileOutputStream(f2);

                        BufferedInputStream bis=new BufferedInputStream(fis,1020);
                        BufferedOutputStream bos=new BufferedOutputStream(fos,1020);
                        int b;
                        while((b=bis.read())!=-1){
                                bos.write(b);
                        }
                        bos.close();
                }catch(Exception e){
                        e.printStackTrace();
                }
        }
}
