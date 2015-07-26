import java.util.Scanner;

public class TheHopefulGPA {

	public static void main(String args[]) {
		MathHouse math = new MathHouse();
		math.equation();

	}
}

class MathHouse {
	double creditsForGraduation;
	double currentGPA;
	double creditsAtTheMoment;

	void equation() {// test every user input for
						// each time scanner happens i want it to do this..
						// if text
		// system.out.println("words are not allowed")
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b == true) {
			System.out.println("Hello, what amount of credit hours are required for graduation?");
			double creditsForGraduation = sc.nextInt();// 129
			if (100 < creditsForGraduation && creditsForGraduation < 150) {
				b = false;
				this.creditsForGraduation = creditsForGraduation;

			} else
				System.err.println("error, wrong input!");
		}
		b = true;
		while (b == true) {
			System.out.println("Hello, what is your GPA?");
			double currentGPA = sc.nextDouble();// 3.0
			if (0 <= currentGPA && currentGPA <= 4) {
				b = false;
				this.currentGPA = currentGPA;
			} else
				System.err.println("error, wrong input!");
		}
		b = true;
		while (b == true) {
			System.out.println("Hello, how many credit hours are completed at the moment?");
			double creditsAtTheMoment = sc.nextInt();// 92
			if (0 <= creditsAtTheMoment
					&& creditsAtTheMoment <= creditsForGraduation) {
				b = false;
				this.creditsAtTheMoment = creditsAtTheMoment;
			} else
				System.err.println("error, wrong input!");
		}
		// enter grades
		// amounts to how many credits?
		// enter number of credits for graduation.
		double maxGPA = (4 * creditsForGraduation); // checked
		double maxAtMomentGPA = (4 * creditsAtTheMoment); //
		double work = (currentGPA * creditsAtTheMoment);
		double loss = maxAtMomentGPA - work;
		double maxPossible = maxGPA - loss;
		double possibleGPA = maxPossible / creditsForGraduation;
		System.out.println("your possible GPA is... " + possibleGPA);

	}

	void input() {
		//for if i wanted to do something with the scanner
	}
}
