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
public class EmpWageBuilderArray implements IComputeEmpWage {
=======
public class EmpWageBuilderArray implements  IComputeEmpWage {
>>>>>>> Day23UseCase11
	//Constans
	public static final int IsPartTime = 1;
	public static final int IsFullTime = 2;
	public static final int ArrayList=0;

	private int numOfCompany = 0;
	private ArrayList<CompanyEmpWage> companyEmpWageArrayList;
	private ArrayList<Integer> dailyWageList;

	public EmpWageBuilderArray() {
		companyEmpWageArrayList = new ArrayList<>();
		dailyWageList = new ArrayList<>();
	}

	public void addCompanyEmpWage(String company, int empRatePerHours, int numOfWorkingDays, int maxHoursPerMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHours, numOfWorkingDays, maxHoursPerMonth);
		companyEmpWageArrayList.add(companyEmpWage);
	}

	public void computeEmpWage() {
<<<<<<< HEAD
		for (int i = 0; i < companyEmpWageArrayList.size(); i++){
			CompanyEmpWage companyEmpWage = companyEmpWageArrayList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	public void computeDailyWage() {
		for (int j = 0; j < dailyWageList.size(); j++) {
			System.out.println(dailyWageList.get(j));
=======
		for (int i = 0; i < numOfCompany; i++){
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
>>>>>>> Day23UseCase11
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
            case IsPartTime:
               empHrs = 8;
               break;
            case IsFullTime:
               empHrs = 12;
               break;
            default:
               empHrs = 0;
         }
			int dailyWage = empHrs * companyEmpWage.empRatePerHours;
			dailyWageList.add(dailyWage);
         totalEmpHrs += empHrs;
         System.out.println("Day#: " + totalWorkingDays + "Employee Hours: " + empHrs);
      }
      return totalEmpHrs * companyEmpWage.empRatePerHours;
   }

	public static void main(String[] args) {
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("DMart", 20, 20, 100);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 50);
		empWageBuilder.computeEmpWage();
		empWageBuilder.computeDailyWage();
	}
}
