import java.util.*;

interface IComputeEmpWage{
	public void addCompanyEmpWage( String company, int empRatePerHours, int numOfWorkingDays, int maxHoursPerMonth );
	public void computeEmpWage();
	public int getTotalWage(String company);
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
	totalEmpWage = 0;
   }

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
   public String toString() {
      return "Total Employee Wage for Company:" +company+" is: "+ totalEmpWage;
   }
}

public class EmpWageBuilderArray implements IComputeEmpWage {
	//Constans
	public static final int IsPartTime = 1;
	public static final int IsFullTime = 2;

	private int numOfCompany = 0;
	private ArrayList<CompanyEmpWage> companyEmpWageArrayList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;;

	public EmpWageBuilderArray() {
		companyEmpWageArrayList = new ArrayList<>();
		companyToEmpWageMap = new HashMap<>();
	}

	public void addCompanyEmpWage(String company, int empRatePerHours, int numOfWorkingDays, int maxHoursPerMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHours, numOfWorkingDays, maxHoursPerMonth);
		companyEmpWageArrayList.add(companyEmpWage);
		companyToEmpWageMap.put(company, companyEmpWage);
	}

	public void computeEmpWage() {
		for (int i = 0; i < companyEmpWageArrayList.size(); i++){
			CompanyEmpWage companyEmpWage = companyEmpWageArrayList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	@Override
	public int getTotalWage(String company) {
		return companyToEmpWageMap.get(company).totalEmpWage;
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
		System.out.println("Total wage for DMart company: " +empWageBuilder.getTotalWage("DMart"));
	}
}
