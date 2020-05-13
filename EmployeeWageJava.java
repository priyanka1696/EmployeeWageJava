public class EmployeeWageJava {

		public static final int IsFullTime=1;
        	public static final int IsPartTime=2;


     public static int computeEmpWage(String company, int empRatePerHrs, 
				      int numberOfWorkingDays,int MaxHrsPerMonth) {

	System.out.println("Welcome to Employee Wage..");

	int TotalEmpHrs=0;
	int EmpHrs=0;
	int TotalWorkingDays=0;
	int TotalEmpWage=0;

while (TotalEmpHrs <= MaxHrsPerMonth && TotalWorkingDays < numberOfWorkingDays) {
	   TotalWorkingDays++;
	   int empcheck=((int)Math.floor(Math.random() * 10))%3;
		switch (( empcheck ))
		 {
		     case IsFullTime:
			EmpHrs=8;
			break;
		     case IsPartTime:
			EmpHrs=4;
			break;
		     default:
			EmpHrs=0;
		}

		TotalEmpHrs+=EmpHrs;
		System.out.println("Day#: " + TotalWorkingDays + "EmpHrs: " +EmpHrs);

	}
	     TotalEmpWage = TotalEmpHrs * empRatePerHrs;
	     System.out.println("Total Emp Wage For Company: " +company+ "is:" +TotalEmpWage);
	     return TotalEmpWage;
}
	     public static void main (String[] args) {
		    computeEmpWage("Dmart",20,2,10);
		    computeEmpWage("Reliance",10,4,20);
	}
}
