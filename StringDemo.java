public class StringDemo {
    public static void main(String[] args){
        String s1="Lucknow";
        String s2=new String("Kanpur");
        String s3="Lucknow";
        String s4=new String("Kanpur");
        //boolean b=(s1==s3);true
        //boolean b=(s2==s4);false
        boolean b =s2.equals(s4);
        System.out.println(s1+" "+s2+" "+s3+" "+s4);
        System.out.println(b);
    }
    
}
