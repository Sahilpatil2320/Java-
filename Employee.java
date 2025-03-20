public class Employee{
	private String firstName;
	private String lastName;
	private double monthlySalary;

	public Employee(String firstName , String lastName, double monthlySalary){
		this.firstName = firstName;
		this.lastName = lastName;
		setMonthlySalary(monthlySalary);
	}
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public double getMonthlySalary(){
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary){
		if(monthlySalary > 0){
			this.monthlySalary = monthlySalary;
		}else{
			this.monthlySalary = 0.0;
		}
	}
	public void giveRaise(){
		this.monthlySalary *= 1.1;
	}
	public static void main(String [] args){
		Employee emp1 = new Employee("John", "Doe", 3000);
		Employee emp2 = new Employee("Jane", "Smith", 4000);

		System.out.println("Before Raise : ");
		displayEmployeeSalary(emp1);
		displayEmployeeSalary(emp2);

		emp1.giveRaise();
		emp2.giveRaise();

		System.out.println("After 10% Raise : ");
		displayEmployeeSalary(emp1);
		displayEmployeeSalary(emp2);
	}
	public static void displayEmployeeSalary(Employee emp){
		System.out.println(emp.getFirstName() + " " + emp.getLastName() + "'s yearly salary: $" + (emp.getMonthlySalary() * 12));
	}
}
/*
Before Raise : 
John Doe's yearly salary: $36000.0
Jane Smith's yearly salary: $48000.0
After 10% Raise : 
John Doe's yearly salary: $39600.00000000001
Jane Smith's yearly salary: $52800.0
*/
