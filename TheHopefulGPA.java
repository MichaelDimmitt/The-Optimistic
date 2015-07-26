import java.util.Scanner;

public class TheHopefulGPA {

	public static void main(String args[]) {
		equation();
	}

	static void equation() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, what amount of credit hours are required for graduation?");
		double creditsForGraduation = sc.nextInt();// 129
		System.out.println("Hello, what is your GPA?");
		double currentGPA = sc.nextInt();// 3.0
		System.out.println("Hello, how many credit hours are completed at the moment?");
		double creditsAtTheMoment = sc.nextInt();// 92
		// enter grades
		// amounts to how many credits?
		// enter number of credits for graduation.
		double maxGPA = (4 * creditsForGraduation);		//checked
		double maxAtMomentGPA = (4 * creditsAtTheMoment);	//
		double work = (currentGPA * creditsAtTheMoment);
		double loss = maxAtMomentGPA - work;
		double maxPossible = maxGPA - loss;
		double possibleGPA = maxPossible/creditsForGraduation;
		System.out.println("your possible GPA is... " + possibleGPA);
		
	}
}
