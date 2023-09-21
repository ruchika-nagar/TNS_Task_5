package TNS_JavaTask_firstpackage;

import java.util.*;	

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	            Scanner s1 = new Scanner(System.in);
				System.out.print("Enter Person Name: ");
				String name = s1.next();
				System.out.print("Enter Age: ");
				int age = s1.nextInt();
				System.out.print("Enter Gender: ");
				String gender = s1.next();
				System.out.print("Enter Taxable Income: ");
				int income = s1.nextInt();
				
				Person p1 = new Person();
				p1.setName(name);
				p1.setAge(age);
				p1.setGender(gender);
				p1.setIncome(income);
				System.out.println("Before calculating tax:");
				System.out.println(p1);
				
				TaxCalculator cal = new TaxCalculator();
				cal.calculateTax(p1);
				System.out.println("After calculating tax:");
				System.out.println(p1);
				
				s1.close();
			}
		

	}