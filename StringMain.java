public class StringMain {
    public static void main(String[] args) {
        String s1="Lucknow City";
        String s2="Junction";
        char c=s1.charAt(4);
        //int len=lastIndexOf(s2);
        String ab=s1.toUpperCase();
        String sd=s2.toLowerCase();
        String k=s1.trim();
        String m=s2.substring(0,4);
        String n=s2.substring(4);
        String s3=s1.concat(s2);
        boolean b=(s1==s2);

        /*char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        System.out.println(c);
        System.out.print(ch[i]);

        String l=new String(ch);
        System.out.println(l);*/

        String[] sa=s1.split(" ");
        for(int i=0;i<sa.length;i++)
        System.out.println(sa[i]+" ");
        
        String p=s1.strip();
        System.out.println(p);
    }
    
}
