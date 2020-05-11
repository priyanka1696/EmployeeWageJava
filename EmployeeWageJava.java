public class EmployeeWageJava {
     public static void main(String[] args) {
         System.out.println("Welcome to Employee Wage..");

	int IsFullTime=1;
	int IsPartTime=2;
	int empRatePerHrs=20;
	int empHrs=0;
	int empwage=0;

	double empcheck=Math.floor(Math.random() * 10)%2;
	if ( empcheck == IsFullTime)
		empHrs=8;
	else if ( empcheck == IsPartTime )
		empHrs=4;

		empwage=empHrs*empRatePerHrs;
		System.out.println("Employee Wage="+empwage);
	}
}
