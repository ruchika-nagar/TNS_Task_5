package TNS_JavaTask_firstpackage;

import TNS_JavaTask_firstpackage.Person;

public class TaxCalculator {
	
	public void calculateTax(Person p1) {
		if(p1.getAge() > 65 || p1.getGender().equalsIgnoreCase("female")) {
			p1.setTax(0);
			System.out.println("Tax Not Appicable");
		}
		else{
			if(p1.getIncome() <= 160000) {
				p1.setTax(0);
			}
			else if(p1.getIncome() > 160000 && p1.getIncome() <= 500000) {
				p1.setTax((p1.getIncome() - 160000) * 10/100);
			}
			else if(p1.getIncome() > 500000 && p1.getIncome() <= 800000) {
				p1.setTax((p1.getIncome() - 500000) * 20/100 + 34000);
			}
			else {
				p1.setTax((p1.getIncome() - 800000)* 30/100 + 94000);
			}
		
		}
	}
}