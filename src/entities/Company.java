package entities;

public class Company extends TaxPayer{

	private Integer numberEmployee;

	public Company(String name, Double income, Integer numberEmployee) {
		super(name, income);
		this.numberEmployee = numberEmployee;
	}

	public Integer getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(Integer numberEmployee) {
		this.numberEmployee = numberEmployee;
	}

	@Override
	public Double taxPaid() {

		if(numberEmployee > 10) {
			return getIncome()*0.14;	
		}
		else
			return getIncome()*0.16;
	}

	@Override
	public String toString() {
		return getName() + ": " + "$ " + String.format("%.2f", taxPaid());
	}

}
