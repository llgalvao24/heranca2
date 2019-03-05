package entities;

public class Individual extends TaxPayer {

	private Double healthExp;

	public Individual(String name, Double income, Double healthExp) {
		super(name, income);
		this.healthExp = healthExp;
	}
	

	public Double getHealthExp() {
		return healthExp;
	}

	public void setHealthExp(Double healthExp) {
		this.healthExp = healthExp;
	}

	@Override
	public Double taxPaid() {
		if(getIncome() < 20000.00)
			return getIncome()*0.15 - healthExp*0.5;
		else
			return getIncome()*0.25 - healthExp*0.5;
	}

	@Override
	public String toString() {
		return getName() + ": " + "$ " + String.format("%.2f", taxPaid()); 
	}

}
