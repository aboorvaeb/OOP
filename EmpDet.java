
public class EmpDet {
			private String firstName;
	private String lastName;
	private double monthlySalary;
	private double yearlySalary;
		EmpDet()
		{
			firstName=null;
			lastName=null;
			monthlySalary=0.0;
			yearlySalary=0.0;
			
		}
	void setDetails(String f,String l,double m)
	{
		firstName=f;
		lastName=l;
		if(m>=0)
			monthlySalary=m;
	}
			String getFirstName()
			{
				return firstName;
			}
	String getLastName()
	{
		return lastName;
	}
	double getMonthlySalary()
	{
		return monthlySalary;
	}
	double calcYearlySalary()
	{
		this.yearlySalary=this.monthlySalary*12;
		return yearlySalary;
	}
	double bonusYearlySalary()
	{
		this.yearlySalary+=0.1*yearlySalary;
		return yearlySalary;
	}
	}

