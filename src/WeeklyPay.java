import java.util.Scanner;
public class WeeklyPay {
	
static double overtimePay = 1.5;
static Scanner input= new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		System.out.println("------------------------------");
		System.out.println("What is your hourly payrate?");
		System.out.println("------------------------------");
		double payrate = input.nextDouble();
		
		System.out.println("------------------------------");
		System.out.println("What is your hours per week?");
		System.out.println("------------------------------");
		double hours = input.nextDouble();
		
		System.out.println("---------------------------------------");
		System.out.println("How many hours did you work overtime?");
		System.out.println("---------------------------------------");
		double overtime = input.nextDouble();
		
		overtime = overtime * overtimePay;
		double total = payrate * hours;
		double overtimeTotal = payrate * hours + overtime;
		
		System.out.println("---------------------------------------");
		System.out.println("Weekly Pay: €"+ total);
		System.out.println("Weekly Pay With Overtime: €"+ overtimeTotal);
		System.out.println("---------------------------------------");
		
	}

}
