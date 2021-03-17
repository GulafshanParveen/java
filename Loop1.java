class Loop1{
        public static void main(String args){
                ab:
                for(int i=0;i<=10;i++){
                        for(int j=0;j<=10;j++){
                                if(j==5) continue ab;
                                System.out.println(i+ " " +j);
                        }
                }
        }
}





