class ForEach{
	public static void main(String[] args){
		int[] number={4,5,6,3,12,43};
		int sum=0;
		for(int num:number){
			sum+=num;
			System.out.println("sum="+sum);
		}
	}
}
