public class EmployeeWageJava {
		public static final int IsFullTime=1;
        	public static final int IsPartTime=2;
  	        public static final int empRatePerHrs=20;

     public static void main(String[] args) {
         System.out.println("Welcome to Employee Wage..");

	int empHrs=0;
	int empwage=0;

	int empcheck=((int)Math.floor(Math.random() * 10))%3;
	switch (( empcheck ))
	{
		case IsFullTime:
			empHrs=8;
			break;
		case IsPartTime:
			empHrs=4;
			break;
		default:
			empHrs=0;
	}

		empwage=empHrs*empRatePerHrs;
		System.out.println("Employee Wage="+empwage);
	}
}
