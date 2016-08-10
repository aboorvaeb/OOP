
public class DateDispl {
	private int month;
	private int day;
	private int year;
	public
		DateDispl()
		{month=0;
		day=0;
		year=0;
		}
	void setDetail(int m,int d,int y)
	{
		month=m;
		day=d;
		year=y;
	}
	int getMonth()
	{
		return month;
	}
	int getDay()
	{
		return day;
	}
	int getYear()
	{
		return year;
	}
	void displayDate()
	{
		System.out.println("The date entered is: ");
		System.out.print(month);
		System.out.print("/" +day);
		System.out.print("/" +year);
		
		
	}
	}


