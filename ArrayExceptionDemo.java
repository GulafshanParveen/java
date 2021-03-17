
public class ArrayExceptionDemo {
    public static void main(String[] args){
        int[] arr=new int[5];
        for(int i=0;i<10;i++)
            arr[i]=i+5;

        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        
    }    
}
