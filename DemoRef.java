/*package mpkg;
import mypkg.AccessDemo;
class AccessDemo2 extends AccessDemo{
        public static void main(String[] args){
                AccessDemo2 a = new AccessDemo2();
                Class ca = a.getClass();
                System.out.println(ca.getName());
                try{
                        Class cl = Class.forName("mypkg.AccessDemo2");
                        AccessDemo2 a1 = (AccessDemo2)cl.newInstance();
                        Class c = AccessDemo2.class;
                        Class ic = int.class;
                }catch(Exception e){
                        e.printStackTrace();
                }


        }

}*/

//saquib code
//package refPkg;

import java.lang.reflect.*;

class ReflectDemo{
        public int a=0;
        public int b=1;
        public int c=3;
        public ReflectDemo(){}
        public ReflectDemo(int a){}
        public void display(){}
        public void printer(){}
}

class ReflectDemo1{
        public static void main(String[]args){
                ReflectDemo r = new ReflectDemo();
                Class cl=r.getClass();
                Constructor[] car = cl.getDeclaredConstructors();
                Field[] fi = cl.getDeclaredFields();
                Method[] ma= cl.getDeclaredMethods();
                for(int i=0;i<car.length;i++){
                        System.out.println(car[i].getName());
                }
                for(int i=0;i<fi.length;i++){
                        System.out.println(fi[i].getName());
                }
                for(int i=0;i<ma.length;i++){
                        System.out.println(ma[i].getName());
                }
		try{
                        Class cl1 = Class.forName("ReflectDemo1");
                        ReflectDemo1 a1 = (ReflectDemo1)cl1.newInstance();
                        Class c = ReflectDemo1.class;
                        Class ic = int.class;
                }catch(Exception e){
                        e.printStackTrace();
                }

        }
}







