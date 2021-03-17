class ArrayMemo{
    public static void main(String[] args){
        //int[][] td=new int[4][] ;
        int[][] td={{1,2,3,4,5},{6,7,8,9,10},{11,13,12,14,15}};
        for(int i=0;i<td[0].length;i++){
            //td[i]=new int[]{2,3,5};
            for(int j=0;j<td.length;j++){
                System.out.print(td[j][i]+" ");
            }
            System.out.println();
        }
    }
}