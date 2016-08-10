import java.util.Scanner;
public class DateDisp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateDispl d=new DateDispl();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Month,Day and Year to be displayed:");
		int m=input.nextInt();
		int da=input.nextInt();
		int y=input.nextInt();
		d.setDetail(m,da,y);
		System.out.println("The month entered is:" + d.getMonth());
		System.out.println("The date entered is:" + d.getDay());
		System.out.println("The year entered is:" + d.getYear());
		d.displayDate();

	}

}
