public class EmployeeWageJava {

		public static final int IsFullTime=1;
        	public static final int IsPartTime=2;
  	        public static final int empRatePerHrs=20;
		public static final int NumberOfWorkingDays=20;
               
     public static void main(String[] args) {
         System.out.println("Welcome to Employee Wage..");

	int TotalEmpWage=0;
	int EmpWage=0;
	int EmpHrs=0;


for (int day = 0; day < NumberOfWorkingDays; day++ ){

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

	        EmpWage = EmpHrs * empRatePerHrs;
		TotalEmpWage+= EmpWage;
		System.out.println("Emp Wage:"+EmpWage);
	}
		System.out.println("Total Emp Wage="+TotalEmpWage);

	}
}
