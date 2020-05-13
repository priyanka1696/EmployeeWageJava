public class EmployeeWageJava {

		public static final int IsFullTime=1;
        	public static final int IsPartTime=2;
  	        public static final int empRatePerHrs=20;
		public static final int NumberOfWorkingDays=20;
		public static final int MaxHrsInMonth=10;

     public static int computeEmpWage() {
         System.out.println("Welcome to Employee Wage..");

	int TotalEmpHrs=0;
	int EmpHrs=0;
	int TotalWorkingDays=0;
	int TotalEmpWage=0;

while (TotalEmpHrs <= MaxHrsInMonth && TotalWorkingDays < NumberOfWorkingDays) 
	{
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
	     int TotlEmpWage = TotalEmpHrs * empRatePerHrs;
	     System.out.println("Total Emp Wage: " +TotalEmpWage);
	     return TotalEmpWage;
}
	     public static void main (String[] args) {
		    computeEmpWage();
	}
}
