
public class T_6_Employee {
	
		private int salary;
		private int hourperday;
		
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getHourperday() {
			return hourperday;
		}
		public void setHourperday(int hourperday) {
			this.hourperday = hourperday;
		}

		public void addSal() {
			if(salary < 500) {
				salary +=10;
			}
		}

		public void addWork() {
			if(hourperday > 6) {
	            salary += 5;
	        }
		}

		public int finalSalary() {
			addSal();
			addWork();
			return salary;
		}
}