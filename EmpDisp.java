import java.util.Scanner;
public class EmpDisp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDet e1=new EmpDet();
		EmpDet e2=new EmpDet();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first name,last name,monthly salary of employee one:");
		String f=input.next();
		String l=input.next();
		double m=input.nextDouble();
		e1.setDetails(f, l, m);
		System.out.println("Enter the first name,last name,monthly salary of employee two:");
		String f1=input.next();
		String l1=input.next();
		double m1=input.nextDouble();
		e2.setDetails(f1,l1,m1);
		System.out.println("The first name of employee one is: " + e1.getFirstName());
		System.out.println("The last name of employee one is: " + e1.getLastName());
		System.out.println("The monthly salary of employee one is:" +e1.getMonthlySalary());
		System.out.println("The first name of employee two is:  " + e2.getFirstName());
		System.out.println("The last name of employee two is: " + e2.getLastName());
		System.out.println("The monthly salary of employee two is:" +e2.getMonthlySalary());
		System.out.println("The yearly salary of employee one is:" +e1.calcYearlySalary());
		System.out.println("The yearly salary of employee two is:" +e2.calcYearlySalary());
		System.out.println("The yearly salary of employee one with bonus is:" + e1.bonusYearlySalary());
		System.out.println("The yearly salary of employee two with bonus is:" +e2.bonusYearlySalary());


	}

}
