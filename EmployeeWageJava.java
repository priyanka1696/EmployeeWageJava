interface IComputeEmpWage{
	public void addCompanyEmpWage( String company, int empRatePerHours, int numOfWorkingDays, int maxHoursPerMonth );
	public void computeEmpWage();
}

class CompanyEmpWage {

   public final String company;
   public final int empRatePerHours;
   public final int numOfWorkingDays;
   public final int maxHoursPerMonth;
   public int totalEmpWage;

   public CompanyEmpWage(String company, int empRatePerHours, int numOfWorkingDays, int maxHoursPerMonth) {
      this.company = company;
      this.empRatePerHours = empRatePerHours;
      this.numOfWorkingDays = numOfWorkingDays;
      this.maxHoursPerMonth = maxHoursPerMonth;
   }

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
   public String toString() {
      return "Total Employee Wage for Company:" +company+" is: "+ totalEmpWage;
   }
}

<<<<<<< HEAD
public class EmployeeWageJava implements IComputeEmpWage {
=======
public class EmployeeWageJava {
>>>>>>> Day23UseCase10
	//Constans
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmployeeWageJava() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	public void addCompanyEmpWage(String company, int empRatePerHours, int numOfWorkingDays, int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHours, numOfWorkingDays, maxHoursPerMonth);
		numOfCompany++;
	}

	public void computeEmpWage() {
		for (int i = 0; i < numOfCompany; i++){
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		//Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
      //Computation
      System.out.println("Welcome to Employee Wage Computation");
      while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
         totalWorkingDays++;
         int empCheck = (int) Math.floor(Math.random() * 10) % 3;
         switch(empCheck) {
            case IS_PART_TIME:
               empHrs = 8;
               break;
            case IS_FULL_TIME:
               empHrs = 12;
               break;
            default:
               empHrs = 0;
         }
         totalEmpHrs += empHrs;
         System.out.println("Day#: " + totalWorkingDays + "Employee Hours: " + empHrs);
      }
      return totalEmpHrs * companyEmpWage.empRatePerHours;
   }

	public static void main(String[] args) {
		EmployeeWageJava empWagejava = new EmployeeWageJava();
		empWagejava.addCompanyEmpWage("DMart", 20, 20, 100);
		empWagejava.addCompanyEmpWage("Reliance", 10, 4, 50);
		empWagejava.computeEmpWage();
	}
}
