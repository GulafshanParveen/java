class ArrayDemo{
    void arrayPointer(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println();
    }
}
public class ArrayMain {
    public static void main(String[] args) {
        ArrayDemo ad=new ArrayDemo();
        int[] arr={2,3,4,5,6,7,8};
        ad.arrayPointer(arr);
        
    }
}
