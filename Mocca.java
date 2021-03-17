public class Mocca extends CompliatioBevrage{
	Bevrage beverage;
	public Mocca(Bevrage beverage){
		this.beverage=beverage;
	}
	public String getDescription(){
		return beverage.getDescription()+"Mocca";
	}
	public double cost(){
		return 0.20+beverage.cost();
	}
}
